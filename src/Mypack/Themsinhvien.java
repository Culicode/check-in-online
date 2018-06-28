package Mypack;

import java.sql.*;
import java.util.*;

public class Themsinhvien 
{
		
	
		
		
		public static void Insertstudent(String ms, String ten)
		{
			Connection conn = null;
			PreparedStatement ptmt = null;
			
			
			conn = DBConnection.KetNoi();
			
			
			
			
			
			
			
			
				String sql = "insert into nhanvien(maso,ten)  values (?,?)";
				
				try 
				{
					ptmt = conn.prepareStatement(sql);
					
					ptmt.setString(1,ms);
					ptmt.setString(2,ten);
                                       
					
					int kt = ptmt.executeUpdate();
					if (kt != 0)
					{
						System.out.println(" Them thanh cong !");
						
					}
					else
					{
						System.out.println(" Them khong thanh cong !");
					}
					
					ptmt.close();
					conn.close();
					
				} 
				catch (SQLException e) 
				{		
					System.out.println("Loi: "+e.getMessage());
				}	
			}
			
			
						
			
		}
		
		
		

