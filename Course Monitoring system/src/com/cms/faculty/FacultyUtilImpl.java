package com.cms.faculty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.DAO.ProvideConnection;
import com.cms.models.CoursePlan;

public class FacultyUtilImpl implements FacultyUtil{

	@Override
	public String facultyLogin(String username, String password) {

		String message="Faculty not logged in...";
		
		
		try (Connection conn= ProvideConnection.getConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from faculty where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				message="Welcome Faculty "+rs.getString("username");
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


}
