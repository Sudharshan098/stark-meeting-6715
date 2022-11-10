package com.cms.batch;

import java.util.List;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Batch;
import com.cms.models.Course;

public class viewBatch {
	
	public static void getBatchList() {
		AdminUtil adUtil = new AdminUtilImpl();
		List<Batch> list= adUtil.viewBatchList();
		list.forEach(s->System.out.println(s));
	}
	

}
