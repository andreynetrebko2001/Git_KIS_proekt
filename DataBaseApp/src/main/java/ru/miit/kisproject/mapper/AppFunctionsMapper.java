package ru.miit.kisproject.mapper;

import java.util.List;
import ru.miit.kisproject.model.AppFunctions;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface AppFunctionsMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */

    @Insert({
        "insert into app_functions (function_name, function_value)",
        "values (#{functionName,jdbcType=VARCHAR}, #{functionValue,jdbcType=VARCHAR})"
    })
    int insert(AppFunctions row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */

    @Select({
        "select",
        "function_name, function_value",
        "from tdma.app_function"
    })
    @Results({
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_value", property="functionValue", jdbcType=JdbcType.VARCHAR)
    })
    List<AppFunctions> selectAll();
}