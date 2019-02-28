package com.howtodoinjava.endpoint;

import javax.xml.soap.SOAPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.howtodoinjava.domainobject.StudentDetailsRequest;
import com.howtodoinjava.domainobject.StudentDetailsResponse;
import com.howtodoinjava.service.StudentService;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/domainobject";

	private static final Logger logger = LoggerFactory.getLogger(StudentEndpoint.class);

	@Autowired
	StudentService studentService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) throws SOAPException {
		logger.info("StudentDetailsRequest >>> Start");
		StudentDetailsResponse response = new StudentDetailsResponse();
		response.setStudent(studentService.getUsername(request));
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
		logger.info("StudentDetailsRequest >>> End");
		return response;
	}

}