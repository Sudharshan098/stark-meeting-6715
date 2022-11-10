package com.cms.course;

import java.util.List;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Course;
import com.cms.models.Faculty;

public class viewCourse {

	public static void getCourseList() {
		AdminUtil adUtil = new AdminUtilImpl();
		List<Course> list= adUtil.viewCourseList();
		list.forEach(s->System.out.println(s));
	}
	
}
