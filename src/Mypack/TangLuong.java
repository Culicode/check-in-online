/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PLQuang
 */
public class TangLuong {
             public void Tang(String ten,int tien)
            {
                Connection conn;
                 PreparedStatement ptmt=null;
                 ResultSet rs = null;
                 String sql;
                  int LuongHT=0;
                 conn=DBConnection.KetNoi();
              
      sql="select * from nhanvien where ten=\""+ten+"\"";
                 try {
                        ptmt = conn.prepareStatement(sql);
                        //Khoi tao ResultSet
                        rs=ptmt.executeQuery();
            Statement stmt = conn.createStatement();
            
                        
                       
                      if(rs.next())
                         {
                           
                      
                         LuongHT =rs.getInt(3);
                         LuongHT=LuongHT +tien;
                     System.out.print("Luong "+LuongHT);
                       String sql1="Update nhanvien set luong=? where ten=\"" +ten+ "\"";
                PreparedStatement ptmt1;
                            ptmt1 = conn.prepareStatement(sql1);
ptmt1.setInt(1, LuongHT); // set parameter value for first_name

ptmt1.executeUpdate();
ptmt1.close();
conn.close();                    
                                           
                                             
                         
                         
                         }
            
          
        } catch (SQLException e) {
                        System.out.println("Loi:" +e.getMessage());
        }
            }
}
            
                    					
	 


				
  

