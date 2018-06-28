package Mypack;

import java.sql.*;

public class DBConnection 
{	
		
		
		public static Connection KetNoi()
		{
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/diemdanh";
			String username = "root";
			String password = "";
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,username,password);
				
				if (conn != null)
				{
					System.out.println("Ket noi thanh cong");
				}
				
				 
				
			} 
			catch (ClassNotFoundException e) 
			{
				System.out.println("Load driver khong thanh cong");	
			}
			catch (SQLException e) 
			{
				System.out.println("Loi: "+e.getMessage());
				
			}
			return conn;
		}
}
