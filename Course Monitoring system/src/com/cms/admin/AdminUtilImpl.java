package com.cms.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.DAO.ProvideConnection;
import com.cms.models.Batch;
import com.cms.models.Course;
import com.cms.models.CoursePlan;
import com.cms.models.Faculty;

public class AdminUtilImpl implements AdminUtil {

	@Override
	public String adminLogin(String username, String password) {
		
		
		String message="Admin not logged in...";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from admin where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				message="Welcome Admin "+rs.getString("username");
			}
			else {
				message="Invalid Username or Password";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String addFaculty(Faculty faculty) {
		
		
         String message="Faculty not added";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into faculty values(?,?,?,?,?,?,?)");
			ps.setInt(1, faculty.getFacultyId());
			ps.setString(2,faculty.getFacultyName());
			ps.setString(3,faculty.getFacultyAddress());
			ps.setString(4,faculty.getMobile());
			ps.setString(5,faculty.getEmail());
			ps.setString(6,faculty.getUsername());
			ps.setString(7,faculty.getPassword());

			
			
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Faculty added succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String addCourse(Course course) {

        String message="Course not added";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into course values(?,?,?,?)");
			ps.setInt(1, course.getCourseId());
			ps.setString(2,course.getCourseName());
			ps.setInt(3,course.getFees());
			ps.setString(4,course.getCourseDesc());
						
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Course added succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String addBatch(Batch batch) {
		 String message="Batch not added";
			
			
			try (Connection conn= ProvideConnection.getConnection()){
				PreparedStatement ps= conn.prepareStatement("insert into batch values(?,?,?,?,?,?)");
				ps.setInt(1, batch.getBatchId());
				ps.setInt(2,batch.getCourseId());
				ps.setInt(3,batch.getFacultyId());
				ps.setInt(4,batch.getNumberOfStudents());
				ps.setString(5,batch.getBatchStartdate());
				ps.setString(6,batch.getDuration());
					
				int rs=ps.executeUpdate();
				if(rs>0) {
					message="Batch added succesfully";
				}
							
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				}
			

			return message;
	}

	@Override
	public String addCoursePlan(CoursePlan courseplan) {
		 String message="Course Plan not added";
			
			
			try (Connection conn= ProvideConnection.getConnection()){
				PreparedStatement ps= conn.prepareStatement("insert into courseplan values(?,?,?,?,?)");
				ps.setInt(1, courseplan.getPlanId());
				ps.setInt(2,courseplan.getBatchId());
				ps.setInt(3,courseplan.getDayNumber());
				ps.setString(4,courseplan.getTopic());
				ps.setString(5,courseplan.getStatus());
					
				int rs=ps.executeUpdate();
				if(rs>0) {
					message="Course Plan added succesfully";
				}
							
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				}
			

			return message;
	}

	@Override
	public List<Faculty> viewFacultyList() {
			
			List<Faculty> list = new ArrayList<>();
			
			
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from faculty");
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				list.add(new Faculty(rs.getInt("facultyid"), rs.getString("facultyName"),  rs.getString("facultyAddress"),  rs.getString("mobile"),  rs.getString("email"),  rs.getString("username")));
				
			}
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return list;
	}

	@Override
	public List<Course> viewCourseList() {
		
		List<Course> list = new ArrayList<>();
				
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from Course");
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				list.add(new Course(rs.getInt("courseId"), rs.getString("courseName"), rs.getInt("fees"), rs.getString("courseDesc")));
				
			}
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return list;
	}

	@Override
	public List<Batch> viewBatchList() {
			List<Batch> list = new ArrayList<>();
			
			
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from batch");
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new Batch(rs.getInt("batchId"), rs.getInt("courseId"), rs.getInt("facultyId"), rs.getInt("NumberOfStudents"), rs.getString("batchStartdate"), rs.getString("duration")));				
			}
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return list;
	}

	@Override
	public List<CoursePlan> viewCoursePlanList() {
			List<CoursePlan> list = new ArrayList<>();
			
			
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from CoursePlan");
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				list.add(new CoursePlan(rs.getInt("planId"), rs.getInt("batchId"), rs.getInt("dayNumber"), rs.getString("topic"), rs.getString("status")));
				
			}
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return list;
	}



}
