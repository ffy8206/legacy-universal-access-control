package com.harry.uac.ws.server.result;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthDatarangeDTO;

@XmlType(name = "AuthDataRangeResult", namespace = WsConstants.NS)
public class AuthDataRangeResult extends WSResult {

	private List<AuthDatarangeDTO> dataRangeList;

	public List<AuthDatarangeDTO> getDataRangeList() {
		return dataRangeList;
	}

	public void setDataRangeList(List<AuthDatarangeDTO> dataRangeList) {
		this.dataRangeList = dataRangeList;
	}

}
