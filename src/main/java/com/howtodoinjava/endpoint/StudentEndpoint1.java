package com.howtodoinjava.endpoint;

import javax.xml.soap.SOAPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.howtodoinjava.domainobject.StudentDetailsRequest1;
import com.howtodoinjava.domainobject.StudentDetailsResponse1;
import com.howtodoinjava.service.StudentService1;

@Endpoint
public class StudentEndpoint1 {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/domainobject";

	private static final Logger logger = LoggerFactory.getLogger(StudentEndpoint1.class);

	@Autowired
	StudentService1 studentService1;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest1")
	@ResponsePayload
	public StudentDetailsResponse1 getStudent1(@RequestPayload StudentDetailsRequest1 request) throws SOAPException {
		logger.info("StudentDetailsRequest1 >>> Start");
		StudentDetailsResponse1 response = new StudentDetailsResponse1();
		response.setStudent1(studentService1.getUsername1(request));
		
//		if (ObjectUtils.isEmpty(request.getName())) {
//			SOAPFault fault;
//			fault = SOAPFactory.newInstance().createFault();
//			fault.setFaultString("400");
//			throw new SOAPFaultException(fault);
//			
//		}
//		if (ObjectUtils.isEmpty(response.getStudent())) {
//			SOAPFault fault;
//			fault = SOAPFactory.newInstance().createFault();
//			fault.setFaultString("500");
//			throw new SOAPFaultException(fault);
//		}
		logger.info("StudentDetailsRequest1 >>> End");
		return response;
	}

}