package com.cms.facultyfunctions;

import java.util.List;

import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.models.CoursePlan;

public class ViewCoursePlan {	
	
	public static void coursePlan() {
	
		FacultyUtil fu = new FacultyUtilImpl();
		
		List<CoursePlan> list= fu.viewCoursePlan();
		
		list.forEach(s->System.out.println(s));
			
	}
	
}
