package com.harry.uac.persistence;

public class Dict {
    private String code;

    private String description;

    private String value;

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getValue() {
	return value;
    }

    public void setValue(String value) {
	this.value = value;
    }

    @Override
    public boolean equals(Object that) {
	if (this == that) {
	    return true;
	}
	if (that == null) {
	    return false;
	}
	if (getClass() != that.getClass()) {
	    return false;
	}
	Dict other = (Dict) that;
	return (this.getCode() == null ? other.getCode() == null: this.getCode().equals(other.getCode()))
	                && (this.getDescription() == null ? other.getDescription() == null: this.getDescription()
	                                .equals(other.getDescription()))
	                && (this.getValue() == null ? other.getValue() == null: this.getValue()
	                                .equals(other.getValue()));
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((getCode() == null) ? 0: getCode().hashCode());
	result = prime * result + ((getDescription() == null) ? 0: getDescription().hashCode());
	result = prime * result + ((getValue() == null) ? 0: getValue().hashCode());
	return result;
    }
}