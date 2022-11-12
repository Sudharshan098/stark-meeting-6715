package com.cms.models;

public class Report {
	private int batchId;
	private String courseName;
	private String facultyName;
	private int NumOfStudents;
	private String date;
	private String duration;
	
	public Report() {
		super();
	}
	public Report(int batchId, String courseName, String facultyName, int numOfStudents, String date, String duration) {
		super();
		this.batchId = batchId;
		this.courseName = courseName;
		this.facultyName = facultyName;
		NumOfStudents = numOfStudents;
		this.date = date;
		this.duration = duration;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getNumOfStudents() {
		return NumOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		NumOfStudents = numOfStudents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Report [batchId=" + batchId + ", courseName=" + courseName + ", facultyName=" + facultyName
				+ ", NumOfStudents=" + NumOfStudents + ", date=" + date + ", duration=" + duration + "]";
	}
	
	 
	

	

}
