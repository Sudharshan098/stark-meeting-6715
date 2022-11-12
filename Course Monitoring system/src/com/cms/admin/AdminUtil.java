package com.cms.admin;

import java.util.List;

import com.cms.Exception.AdminException;
import com.cms.Exception.BatchException;
import com.cms.Exception.CourseException;
import com.cms.Exception.CoursePlanException;
import com.cms.Exception.FacultyException;
import com.cms.models.Batch;
import com.cms.models.Course;
import com.cms.models.CoursePlan;
import com.cms.models.Faculty;
import com.cms.models.Report;

public interface AdminUtil {
	
	public void adminLogin(String username, String password) throws AdminException;
	
	public String addFaculty(Faculty faculty)  throws FacultyException;

	public String addCourse(Course course)throws CourseException;
	
	public String addBatch(Batch batch) throws BatchException;
	
	public String addCoursePlan(CoursePlan coursePlan) throws CoursePlanException;
	
	public List<Faculty> viewFacultyList() throws FacultyException;
	
	public List<Course> viewCourseList() throws CourseException;
	
    public List<Batch> viewBatchList() throws BatchException ;
	
	public List<CoursePlan> viewCoursePlanList() throws CoursePlanException;
	
	public String allocatefaculty(int facId,int batchId)throws BatchException,FacultyException;
	
	public String updateFacAddress(int facId,String newAddress)throws FacultyException;
	
	public String updateCourseFees(int courseId,int fees)throws CourseException;
	
	public String updateNosFromBatch(int batchId,int NumOfStud)throws BatchException;
	
	public String changeFacFromBatch(int facId,int newFacId)throws BatchException;
	
	public List<CoursePlan> viewCoursePlanStatus(int planId)throws CoursePlanException;
	
	public List<CoursePlan> viewDaywiseUpdateOfBatch(int batchId,int dayNumber)throws CoursePlanException;


	public List<Report> generateReport(int batchId)throws BatchException,CourseException,FacultyException; 
	
	
	
	



}
