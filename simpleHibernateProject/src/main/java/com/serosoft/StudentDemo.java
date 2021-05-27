package com.serosoft;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDemo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  id;
	private String name;
	private String email;
	
	private  StudentSubject subject;
	
	
	public StudentDemo(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public StudentDemo() {
		super();
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public StudentSubject getSubject() {
		return subject;
	}

	public void setSubject(StudentSubject subject) {
		this.subject = subject;
	}
	

}
