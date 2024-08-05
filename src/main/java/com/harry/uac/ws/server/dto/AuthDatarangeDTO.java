package com.harry.uac.ws.server.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
@XmlType(name = "AuthDatarange", namespace = WsConstants.NS)
public class AuthDatarangeDTO {

    private String appcode;

    private String datarangeCode;

    private String datarangeName;

    private String datarangeValue;

    private String datarangeDescription;

    public String getAppcode() {
	return appcode;
    }

    public void setAppcode(String appcode) {
	this.appcode = appcode;
    }

    public String getDatarangeCode() {
	return datarangeCode;
    }

    public void setDatarangeCode(String datarangeCode) {
	this.datarangeCode = datarangeCode == null ? null: datarangeCode.trim();
    }

    public String getDatarangeName() {
	return datarangeName;
    }

    public void setDatarangeName(String datarangeName) {
	this.datarangeName = datarangeName == null ? null: datarangeName.trim();
    }

    public String getDatarangeValue() {
	return datarangeValue;
    }

    public void setDatarangeValue(String datarangeValue) {
	this.datarangeValue = datarangeValue == null ? null: datarangeValue.trim();
    }

    public String getDatarangeDescription() {
	return datarangeDescription;
    }

    public void setDatarangeDescription(String datarangeDescription) {
	this.datarangeDescription = datarangeDescription == null ? null: datarangeDescription.trim();
    }

    /**
     * for log output
     */
    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((appcode == null) ? 0: appcode.hashCode());
	result = prime * result + ((datarangeCode == null) ? 0: datarangeCode.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	AuthDatarangeDTO other = (AuthDatarangeDTO) obj;
	if (appcode == null) {
	    if (other.appcode != null)
		return false;
	} else if (!appcode.equals(other.appcode))
	    return false;
	if (datarangeCode == null) {
	    if (other.datarangeCode != null)
		return false;
	} else if (!datarangeCode.equals(other.datarangeCode))
	    return false;
	return true;
    }

}