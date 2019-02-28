package com.howtodoinjava.repository;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.howtodoinjava.client.SOAPConfig;
import com.howtodoinjava.client.SOAPConnector;
import com.howtodoinjava.domainobject.Student;
import com.howtodoinjava.domainobject.StudentDetailsRequest;
import com.howtodoinjava.domainobject.StudentDetailsResponse;
import com.howtodoinjava.service.StudentRepository;

@Component
public class StudentRepositoryImpl implements StudentRepository {

	private static final Map<String, Student> students = new HashMap<>();
	private static final Logger logger = LoggerFactory.getLogger(StudentRepositoryImpl.class);

	public void initData() {
		Student student = new Student();
		student.setName("Lokesh");
		student.setStandard(6);
		student.setAddress("Delhi");
		students.put(student.getName(), student);

		student = new Student();
		student.setName("Sukesh");
		student.setStandard(7);
		student.setAddress("Noida");
		students.put(student.getName(), student);
	}

	@Override
	public Student findStudent(StudentDetailsRequest req) {
		initData();
		Assert.notNull(req.getName(), "The Student's name must not be null");
//		logger.info("StudentRepositoryImpl >>> Start");

//		// client
//		SOAPConfig config = new SOAPConfig();
//		SOAPConnector soapConnector = config.soapConnector(config.marshaller());
		String name = "Lokesh";// Default Name

		StudentDetailsRequest request = new StudentDetailsRequest();
		request.setName(name);
//		StudentDetailsResponse response = (StudentDetailsResponse) soapConnector
//				.callWebService("http://localhost:9090/service/student-details", request);
//		System.out.println("Client Got Response As below ========= : ");
//		System.out.println("Client Name : " + response.getStudent().getName());
//		System.out.println("Client Standard : " + response.getStudent().getStandard());
//		System.out.println("Client Address : " + response.getStudent().getAddress());
//		logger.info("StudentRepositoryImpl >>> End");
		return students.get(req.getName());
	}
}