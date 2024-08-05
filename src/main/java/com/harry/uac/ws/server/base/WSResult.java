package com.harry.uac.ws.server.base;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;

/**
 * WebService return values base class, defines all return values.
 * 
 * @author wangding
 */
@XmlType(name = "WSResult", namespace = WsConstants.NS)
public class WSResult {

	// defined according by rules, likes 4xx represents arguments error from client, 5xx represents business error
	public static final String SUCESS = "0";
	public static final String PARAMETER_ERROR = "400";
	public static final String PARAMETER_ERROR_MESSAGE = "Wrong parameters";

	public static final String SYSTEM_ERROR = "500";
	public static final String SYSTEM_ERROR_MESSAGE = "Runtime unknown internal error.";
	
	public static final String BUZ_ERROR_USER_NOT_EXSIT = "501";
	public static final String BUZ_ERROR_PWD_INVALID = "502";
	public static final String BUZ_ERROR_ORG_NOTFOUND = "503";

	//-- WSResult base properties --//
	private String code = SUCESS;
	private String message;

	/**
	* sets result
	*/
	public void setError(String resultCode, String resultMessage) {
		code = resultCode;
		message = resultMessage;
	}

	/**
	 * sets exception result
	 */
	public void setDefaultError() {
		setError(SYSTEM_ERROR, SYSTEM_ERROR_MESSAGE);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
