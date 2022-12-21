package ru.miit.kisproject.services;

import ru.miit.kisproject.mapper.AppFunctionsMapper;
import ru.miit.kisproject.model.AppFunctions;
import ru.miit.kisproject.model.DataStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class RunWorkBdService {
    @Autowired
    AppFunctionsMapper appFunctionsMapper;

    @Autowired
    DataStorage dataStorage;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<AppFunctions> appFunctionsList = appFunctionsMapper.selectAll();
        List<AppFunctions> filteredvivsdAsoupPOperList = appFunctionsList.parallelStream().filter((kodOp) -> {
            return Objects.equals(kodOp.getFunctionName(), "ENABLE_ZERO_VAR");
        }).collect(Collectors.toList());
        dataStorage.getAppFunctionsList().addAll(appFunctionsList);
    }
}
