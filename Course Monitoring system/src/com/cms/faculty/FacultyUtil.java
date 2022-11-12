package com.cms.faculty;

import java.util.List;

import com.cms.Exception.CoursePlanException;
import com.cms.Exception.FacultyException;
import com.cms.models.CoursePlan;

public interface FacultyUtil {
	
	public void facultyLogin(String username, String password)throws FacultyException;
	
	public List<CoursePlan> viewCoursePlan()throws CoursePlanException;
	
	public String changePassword(String username,String password,String newPassword)throws FacultyException;
	
	public String fillupPlanner(CoursePlan courseplan)throws CoursePlanException;

	public String updateCourseplanStatus(int id,String status)throws CoursePlanException;

}
