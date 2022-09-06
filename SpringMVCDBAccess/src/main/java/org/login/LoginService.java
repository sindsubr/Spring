package org.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginService {
	public boolean credentialCheck(String uname,String password) {
		try {
			String url = "jdbc:mysql://localhost:3306/springjdbc";
			String u="root";
			String p = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,u,p);
			PreparedStatement pst = con.prepareStatement("select * from Login where uname=? and password=?");
			pst.setString(1, uname);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
				return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
