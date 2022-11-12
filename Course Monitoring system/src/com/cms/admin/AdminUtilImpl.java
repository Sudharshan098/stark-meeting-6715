package com.cms.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.DAO.ProvideConnection;
import com.cms.adminfunctions.AdminOptions;
import com.cms.frontend.Main;
import com.cms.models.Batch;
import com.cms.models.Course;
import com.cms.models.CoursePlan;
import com.cms.models.Faculty;
import com.cms.models.Report;

public class AdminUtilImpl implements AdminUtil {

	@Override
	public void adminLogin(String username, String password) {
		
		
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from admin where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Welcome Admin "+rs.getString("username"));
				System.out.println();

				AdminOptions.adminFunctions();
			}
			else {
				System.out.println("Invalid Username or Password");
				System.out.println();
				Main.main(null);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		
	
		
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

	@Override
	public String allocatefaculty(int facId,int batchId) {
		String message="Faculty not allocated to batch";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update batch set facultyid=? where batchid=?");
			
			ps.setInt(1, facId );
			ps.setInt(2, batchId);
			
				
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Faculty allocated succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
		
	}

	@Override
	public String updateFacAddress(int facId,String newAddress) {
		
String message="Faculty Address not updated......";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update Faculty set facultyaddress=? where facultyId=?");
			
			ps.setString(1, newAddress );
			ps.setInt(2, facId);
			
				
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Faculty Address updated succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String updateCourseFees(int courseId, int fees) {
		String message="Course Fees updated......";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update course set fees=? where courseId=?");
			
			ps.setInt(1, fees );
			ps.setInt(2, courseId);
			
				
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Course Fees updated succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String updateNosFromBatch(int batchId, int NumOfStud) {
		String message="Students count not updated......";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update batch set NumberOfStudents = NumberOfStudents+? where batchId=?");
			
			ps.setInt(1, NumOfStud );
			ps.setInt(2, batchId);
			
				
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Students count updated succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public String changeFacFromBatch(int batchId, int newFacId) {
		String message="Faculty not changed......";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update batch set facultyId =? where batchid=?");
			
			ps.setInt(1, newFacId );
			ps.setInt(2, batchId);
			
				
			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Faculty changed succesfully";
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return message;
	}

	@Override
	public List<CoursePlan> viewCoursePlanStatus(int planId) {
		  List<CoursePlan> list = new ArrayList<>();
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from courseplan where planId=?");
			
			ps.setInt(1, planId);
			
				
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				list.add(new CoursePlan(rs.getInt("planid"), rs.getInt("batchId"), rs.getInt("dayNumber"), rs.getString("topic"),rs.getString("status") ));
				
			}
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		

		return list;
	}

	@Override
	public List<CoursePlan> viewDaywiseUpdateOfBatch(int batchId, int dayNumber) {
		  List<CoursePlan> list = new ArrayList<>();
			
			
			try (Connection conn= ProvideConnection.getConnection()){
				PreparedStatement ps= conn.prepareStatement("select * from courseplan where batchId=? AND dayNumber=?");
				
				ps.setInt(1, batchId);
				ps.setInt(2, dayNumber);
				
					
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					list.add(new CoursePlan(rs.getInt("planid"), rs.getInt("batchId"), rs.getInt("dayNumber"), rs.getString("topic"),rs.getString("status") ));
					
				}
							
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				}
			

			return list;
	}

	@Override
	public List<Report> generateReport(int batchId) {
		 List<Report> list = new ArrayList<>();
		
			
			try (Connection conn= ProvideConnection.getConnection()){
				PreparedStatement ps= conn.prepareStatement("select b.batchId,c.courseName,f.facultyName,b.NumberOfStudents,b.batchStartdate,b.duration  from batch b INNER JOIN course c INNER JOIN faculty f ON b.courseid = c.courseID AND b.facultyId = f.facultyId where batchId=?");
				
				ps.setInt(1, batchId);
				
				
					
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					list.add(new Report(rs.getInt("batchId"), rs.getString("courseName"), rs.getString("facultyName"),  rs.getInt("NumberOfStudents"), rs.getString("batchStartdate"), rs.getString("duration")) );
				}
							
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				}
			

			return list;
	}



}
