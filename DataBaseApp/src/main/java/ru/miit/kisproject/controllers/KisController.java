package ru.miit.kisproject.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.AppFunctions;

import java.util.List;


@RestController
@RequestMapping("/kis")
@Tag(name = "Сервис КИС", description = "Функции")
public class KisController {

    @Autowired
    DataStorage dataStorage;

    @Operation(
            summary = "Функции",
            description = "Сервис возвращает возможные функции системы"
    )
    @GetMapping(value = "/app_functions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AppFunctions> getAppFunctions(){
        return dataStorage.getAppFunctionsList();
    }
}
