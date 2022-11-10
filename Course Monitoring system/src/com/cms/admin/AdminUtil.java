package com.cms.admin;

import java.util.List;

import com.cms.models.Batch;
import com.cms.models.Course;
import com.cms.models.CoursePlan;
import com.cms.models.Faculty;

public interface AdminUtil {
	
	public String adminLogin(String username, String password);
	
	public String addFaculty(Faculty faculty);

	public String addCourse(Course course);
	
	public String addBatch(Batch batch);
	
	public String addCoursePlan(CoursePlan coursePlan);
	
	public List<Faculty> viewFacultyList();
	
	public List<Course> viewCourseList();
	
    public List<Batch> viewBatchList();
	
	public List<CoursePlan> viewCoursePlanList();


}
