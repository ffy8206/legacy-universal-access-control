package com.harry.uac.ws.server.base;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;

/**
 * General IdResult
 * 
 * @author wangding
 *
 */
@XmlType(name = "IdResult", namespace = WsConstants.NS)
public class IdResult extends WSResult {
	private Long id;

	public IdResult() {
	}

	public IdResult(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
