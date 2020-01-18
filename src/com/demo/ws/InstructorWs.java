package com.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.demo.instructor.entities.Instructor;

@WebService
public interface InstructorWs {

	@WebMethod
	Instructor getInstructor(String id);
}
