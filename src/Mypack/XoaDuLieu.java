/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PLQuang
 */
public class XoaDuLieu {
    public static void DeleteData(String s)
		{
			Connection conn = null;
			PreparedStatement ptmt = null;
			
			
			conn = DBConnection.KetNoi();
			
			
			
			
			
			
			
			
				String sql = "delete from nhanvien where ten=\"" + s+"\"";
				
				try 
				{
					ptmt = conn.prepareStatement(sql);
					int kt = ptmt.executeUpdate();
					if (kt != 0)
					{
						System.out.println(" Xoa thanh cong !");
						
					}
					else
					{
						System.out.println("Xoa khong thanh cong !");
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
