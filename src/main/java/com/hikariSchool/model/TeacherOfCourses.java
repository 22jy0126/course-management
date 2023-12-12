package com.hikariSchool.model;

import java.util.ArrayList;

public class TeacherOfCourses extends Teacher {
	private ArrayList<Classes> courses;

	public TeacherOfCourses(Integer teacherId, String teacherName, ArrayList<Classes> courses) {
		super(teacherId, teacherName);
		this.courses = courses;
	}
	public TeacherOfCourses() {}
	public ArrayList<Classes> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Classes> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "TeacherOfCourses [courses=" + courses + "]";
	}
	
	
}
