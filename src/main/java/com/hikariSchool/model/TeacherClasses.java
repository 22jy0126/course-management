package com.hikariSchool.model;

public class TeacherClasses extends Teacher {
	private Integer classId;
	private String className;
	public TeacherClasses(Integer teacherId, String teacherName, Integer classId, String className) {
		super(teacherId, teacherName);
		this.classId = classId;
		this.className = className;
	}
	public TeacherClasses() {}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "TeacherClasses [classId=" + classId + ", className=" + className + "]";
	}
	
}
