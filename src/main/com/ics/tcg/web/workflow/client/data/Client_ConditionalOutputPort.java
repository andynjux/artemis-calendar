//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.16 at 11:50:14 ���� CST 
//

package com.ics.tcg.web.workflow.client.data;

import java.io.Serializable;

public class Client_ConditionalOutputPort extends Client_OutputPort implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4087787185562747328L;
	Client_IfCondition client_IfCondition;

	public Client_IfCondition getClient_IfCondition() {
		return client_IfCondition;
	}

	public void setClient_IfCondition(Client_IfCondition client_IfCondition) {
		this.client_IfCondition = client_IfCondition;
	}
}
