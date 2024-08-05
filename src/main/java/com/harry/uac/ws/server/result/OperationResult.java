package com.harry.uac.ws.server.result;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;

@XmlType(name = "OperationResult", namespace = WsConstants.NS)
public class OperationResult extends WSResult {

    private boolean result;

    public boolean isResult() {
	return result;
    }

    public void setResult(boolean result) {
	this.result = result;
    }

    public OperationResult() {
    }

    public OperationResult(boolean result) {
	super();
	this.result = result;
    }

}
