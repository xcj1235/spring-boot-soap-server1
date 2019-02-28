package com.howtodoinjava.exception;

import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

public class SoapFaultException {
	private SOAPFault fault;

	public SoapFaultException(SOAPFault fault) {
		this.fault = fault;
	}

	public SOAPFaultException getSoapFaultException() {
		return new SOAPFaultException(fault);
	}
}
