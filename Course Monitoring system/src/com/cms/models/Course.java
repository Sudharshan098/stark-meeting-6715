package com.cms.models;

import java.util.Objects;

public class Course {
	
	private int courseId;
	private String courseName;
	private int fees;
	private String courseDesc;
	public Course() {
		super();
	}
	public Course(int courseId, String courseName, int fees, String courseDesc) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.courseDesc = courseDesc;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", courseDesc="
				+ courseDesc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseDesc, courseId, courseName, fees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseDesc, other.courseDesc) && courseId == other.courseId
				&& Objects.equals(courseName, other.courseName) && fees == other.fees;
	}
	
	
	

}
