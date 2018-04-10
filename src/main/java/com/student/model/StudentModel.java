package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private int studentAge;
	private String studentFirstname;
	private String studentMiddlename;
	private String studentLastname;

	public StudentModel() {

	}

	public StudentModel(Long studentId, int studentAge, String studentFirstname, String studentMiddlename,
			String studentLastname) {

		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentFirstname = studentFirstname;
		this.studentMiddlename = studentMiddlename;
		this.studentLastname = studentLastname;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentFirstname() {
		return studentFirstname;
	}

	public void setStudentFirstname(String studentFirstname) {
		this.studentFirstname = studentFirstname;
	}

	public String getStudentMiddlename() {
		return studentMiddlename;
	}

	public void setStudentMiddlename(String studentMiddlename) {
		this.studentMiddlename = studentMiddlename;
	}

	public String getStudentLastname() {
		return studentLastname;
	}

	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}

	 @Override
	 public String toString() {
	 return "StudentModel [studentId=" + studentId + ", studentFirstname=" +
	 studentFirstname
	 + ", studentMiddlename=" + studentMiddlename + ", studentLastname=" +
	 studentLastname + ", studentAge="
	 + studentAge + "]";
	 }

}
