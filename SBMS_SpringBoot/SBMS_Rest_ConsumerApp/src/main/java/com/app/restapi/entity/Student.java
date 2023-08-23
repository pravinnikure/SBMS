package com.app.restapi.entity;

public class Student {

	private Integer stdId;

	private String stdName;
	private String stdGen;

	private String stdCourse;

	private String stdAdd;

	public Student() {
		super();
	}

	public Student(Integer stdId, String stdName, String stdGen, String stdCourse, String stdAdd) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdGen = stdGen;
		this.stdCourse = stdCourse;
		this.stdAdd = stdAdd;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdGen() {
		return stdGen;
	}

	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdAdd() {
		return stdAdd;
	}

	public void setStdAdd(String stdAdd) {
		this.stdAdd = stdAdd;
	}

}
