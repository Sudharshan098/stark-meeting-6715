package com.cms.adminfunctions;

import java.util.List;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Faculty;

public class ViewFaculty {
	
	public static void getFacultyList() {
		AdminUtil adUtil = new AdminUtilImpl();
		List<Faculty> list= adUtil.viewFacultyList();
		list.forEach(s->System.out.println(s));
	}
	
}
