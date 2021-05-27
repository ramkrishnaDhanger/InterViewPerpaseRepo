package com.serosoft;

import javax.persistence.Embeddable;

@Embeddable
public class StudentSubject {
	private String  subjectName;
	private String  subjectDuration;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectDuration(String subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	
	

}
