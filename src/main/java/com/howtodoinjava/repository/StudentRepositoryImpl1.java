package com.howtodoinjava.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.howtodoinjava.domainobject.Student;
import com.howtodoinjava.domainobject.Student1;
import com.howtodoinjava.domainobject.StudentDetailsRequest1;
import com.howtodoinjava.service.StudentRepository1;

@Component
public class StudentRepositoryImpl1 implements StudentRepository1 {
	private static final Map<String, Student1> students1 = new HashMap<>();
	private static final Logger logger = LoggerFactory.getLogger(StudentRepositoryImpl1.class);

	public void initData() {
		Student1 student1 = new Student1();
		student1.setName1("Lokesh");
		student1.setStandard1(6);
		student1.setAddress1("Delhi");
		students1.put(student1.getName1(), student1);

		student1 = new Student1();
		student1.setName1("Sukesh");
		student1.setStandard1(7);
		student1.setAddress1("Noida");
		students1.put(student1.getName1(), student1);
	}

	@Override
	public Student1 findStudent1(StudentDetailsRequest1 req) {
		initData();
		Assert.notNull(req.getName1(), "The Student's name must not be null");
		logger.info(req.getName1() + "-----------findStudent1----------");
		return students1.get(req.getName1());
	}
}