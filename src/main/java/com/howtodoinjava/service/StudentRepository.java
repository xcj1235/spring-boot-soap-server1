package com.howtodoinjava.service;

import com.howtodoinjava.domainobject.Student;
import com.howtodoinjava.domainobject.StudentDetailsRequest;

public interface StudentRepository {
	public Student findStudent(StudentDetailsRequest req);
}
