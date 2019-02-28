package com.howtodoinjava.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.howtodoinjava.domainobject.Student1;
import com.howtodoinjava.domainobject.StudentDetailsRequest1;

@Service
@SuppressWarnings("resource")
public class StudentServiceImpl1 implements StudentService1 {
	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Override
	public Student1 getUsername1(StudentDetailsRequest1 req1) {
		Assert.notNull(req1.getName1(), "The Student's name must not be null");
		logger.info(req1.getName1() + "-----------StudentServiceImpl1----------");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentRepository1 repository = context.getBean("StudentRepository1", StudentRepository1.class);

		return repository.findStudent1(req1);
	}
}
