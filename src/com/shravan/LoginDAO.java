package com.shravan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	String sql = "select * from login where username=? and password=?";
	
	public boolean Check(String username, String password)
	{
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shravan", "root", "Shravan@616");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, username);
		st.setString(2, password);
		
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
		
		
	}

}
