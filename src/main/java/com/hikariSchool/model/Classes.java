package com.hikariSchool.model;

public class Classes {
	private Integer classId;
	private String className;
	private Integer categoryId;
	private String description;
	private Integer teacherId;
	private Integer studentsLimit;
	private Integer price;
	public Classes(Integer classId, String className, Integer categoryId, String description, Integer teacherId,
			Integer studentsLimit, Integer price) {
		super();
		this.classId = classId;
		this.className = className;
		this.categoryId = categoryId;
		this.description = description;
		this.teacherId = teacherId;
		this.studentsLimit = studentsLimit;
		this.price = price;
	}
	public Classes() {
		super();
	}
	public Classes(Integer classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}
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
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getStudentsLimit() {
		return studentsLimit;
	}
	public void settStudentsLimit(Integer studentsLimit) {
		this.studentsLimit = studentsLimit;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", categoryId=" + categoryId
				+ ", description=" + description + ", teacherId=" + teacherId + ", studentsLimit=" + studentsLimit
				+ ", price=" + price + "]";
	}
	
	
}
