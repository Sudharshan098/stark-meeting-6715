package com.cms.faculty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.DAO.ProvideConnection;
import com.cms.facultyfunctions.FacultyOptions;
import com.cms.frontend.Main;
import com.cms.models.CoursePlan;

public class FacultyUtilImpl implements FacultyUtil{

	@Override
	public void facultyLogin(String username, String password) {

		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from faculty where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Welcome Faculty "+rs.getString("username"));
				System.out.println();
				 FacultyOptions.facultyFunctions();
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
	public List<CoursePlan> viewCoursePlan() {
		
		List<CoursePlan> list= new ArrayList<>();
		
		try(Connection conn=ProvideConnection.getConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select * from courseplan");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				list.add(new CoursePlan(rs.getInt("planid"), rs.getInt("batchid"), rs.getInt("dayNumber") , rs.getString("topic"), rs.getString("status")));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}

	@Override
	public String changePassword(String username, String password, String newPassword) {
		
		
	String message="Password not changed...";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update faculty set password=? where username=? AND password=?");
			ps.setString(1, newPassword);
			ps.setString(2, username);
			ps.setString(3, password);

			int  rs=ps.executeUpdate();
			if(rs>0) {
				message="Password changed successfully "+username;
			}
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}

		return message;
		
	}

	@Override
	public String fillupPlanner(CoursePlan courseplan) {
		
		
		String message="Plan not submitted...";
			
			
			try (Connection conn= ProvideConnection.getConnection()){
				PreparedStatement ps= conn.prepareStatement("insert into courseplan(batchId,dayNumber,topic,status) values(?,?,?,?)");
				ps.setInt(1, courseplan.getBatchId());
				ps.setInt(2, courseplan.getDayNumber());
				ps.setString(3, courseplan.getTopic());
				ps.setString(4, courseplan.getStatus());


				int rs=ps.executeUpdate();
				if(rs>0) {
					message="Daywise Plan submitted successfully";
				}
						
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				}
			
			return message;

	}

	@Override
	public String updateCourseplanStatus(int id, String status) {
		String message="Status not updated...";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("update courseplan set status=? where planid=?");
		
			ps.setString(1, status);

			ps.setInt(2, id);
		
			

			int rs=ps.executeUpdate();
			if(rs>0) {
				message="Status updated successfully";
			}
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}

		return message;
	
	}


}
