package com.howtodoinjava.service;

import com.howtodoinjava.domainobject.Student;
import com.howtodoinjava.domainobject.StudentDetailsRequest;

public interface StudentService {
	public Student getUsername(StudentDetailsRequest req);
}
