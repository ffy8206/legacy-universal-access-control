package com.harry.uac.persistence;

public class SysParameter {
    private String parameterName;

    private String parameterValue;

    private Integer parameterOrder;

    private String parameterDescription;

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue == null ? null : parameterValue.trim();
    }

    public Integer getParameterOrder() {
        return parameterOrder;
    }

    public void setParameterOrder(Integer parameterOrder) {
        this.parameterOrder = parameterOrder;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription == null ? null : parameterDescription.trim();
    }
}