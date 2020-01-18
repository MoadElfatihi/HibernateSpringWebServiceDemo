package com.demo.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="Instructor")
public class Instructor {

	private int instructorId;
	
	private String firstName;
	
	private String lastName;

	public Instructor() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getInstructorId() {
		return instructorId;
	}
	
	
}
