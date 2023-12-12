package com.hikariSchool.model;

public class CourseDetail extends Classes {
	private String categoryName;
	private String teacherName;
	public CourseDetail(Integer classId, String className, Integer categoryId, String description, Integer teacherId,
			Integer studentsLimit, Integer price, String categoryName, String teacherName) {
		super(classId, className, categoryId, description, teacherId, studentsLimit, price);
		this.categoryName = categoryName;
		this.teacherName = teacherName;
	}
	
	public CourseDetail() {}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "CourseDetail [categoryName=" + categoryName + ", teacherName=" + teacherName + "]";
	}
	
	
}
