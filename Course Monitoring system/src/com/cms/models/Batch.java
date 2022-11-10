package com.cms.models;

import java.util.Objects;

public class Batch {
	
	private int batchId;
	private int courseId;
	private int facultyId;
	private int NumberOfStudents;
	private String batchStartdate;
	private String duration;
	public Batch() {
		super();
	}
	public Batch(int batchId, int courseId, int facultyId, int numberOfStudents, String batchStartdate,
			String duration) {
		super();
		this.batchId = batchId;
		this.courseId = courseId;
		this.facultyId = facultyId;
		NumberOfStudents = numberOfStudents;
		this.batchStartdate = batchStartdate;
		this.duration = duration;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public int getNumberOfStudents() {
		return NumberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		NumberOfStudents = numberOfStudents;
	}
	public String getBatchStartdate() {
		return batchStartdate;
	}
	public void setBatchStartdate(String batchStartdate) {
		this.batchStartdate = batchStartdate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", facultyId=" + facultyId
				+ ", NumberOfStudents=" + NumberOfStudents + ", batchStartdate=" + batchStartdate + ", duration="
				+ duration + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(NumberOfStudents, batchId, batchStartdate, courseId, duration, facultyId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		return NumberOfStudents == other.NumberOfStudents && batchId == other.batchId
				&& Objects.equals(batchStartdate, other.batchStartdate) && courseId == other.courseId
				&& Objects.equals(duration, other.duration) && facultyId == other.facultyId;
	}
	
	

}

