package com.demo.instructor.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="pk_seq")
	private int id;
	
	@Column(name="channel")
	private String channel;
	
	@Column(name="hobby")
	private String hobby;
	
	@OneToOne(mappedBy = "instructorDetail",cascade=CascadeType.ALL)
	private Instructor instructor;

	public InstructorDetail() {
		super();
	}

	public InstructorDetail(String channel, String hobby) {
		super();
		this.channel = channel;
		this.hobby = hobby;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", channel=" + channel + ", hobby=" + hobby + ", instructor=" + instructor
				+ "]";
	}
	
	
}
