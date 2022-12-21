package ru.miit.kisproject.model;

/**
 * Table: app_functions
 */
public class AppFunctions {
    /**
     * Column: function_name
     * Type: varchar(40)
     */
    private String functionName;

    /**
     * Column: function_value
     * Type: varchar(40)
     */
    private String functionValue;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getFunctionValue() {
        return functionValue;
    }

    public void setFunctionValue(String functionValue) {
        this.functionValue = functionValue == null ? null : functionValue.trim();
    }
}