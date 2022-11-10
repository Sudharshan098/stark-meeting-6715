package com.cms.faculty;

import java.util.List;

import com.cms.models.CoursePlan;

public interface FacultyUtil {
	
	public String facultyLogin(String username, String password);
	
	public List<CoursePlan> viewCoursePlan();


}
