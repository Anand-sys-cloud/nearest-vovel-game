package com.vovel.play;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class uploadscore {
	
	 String url="jdbc:mysql://localhost:3306/";
	  String dbname="vovel";
	  String uname="root";
	  String pwd="root";
	  Connection con;
	  Statement stmt;
	
		public void initDB() throws SQLException {
			// TODO Auto-generated method stub
			con=DriverManager.getConnection(url+dbname,uname,pwd);
			stmt=con.createStatement();
			//System.out.println("Getting connected to the vovel database");
		}

	
		public void insert(int id, String name, int score) throws SQLException {
			// TODO Auto-generated method stub
			
			String insert ="insert into vovel.user values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, score);
			ps.executeUpdate();
			//System.out.println("one record inserted");
			System.out.println("Your Score is:" +score);
				
		}
		
		public void select() throws SQLException
		{
			String select="select * from vovel.user";
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(select);
			while(res.next()==false)
			{
				int id=res.getInt(1);
				String name=res.getString(2);
				int score=res.getInt(3);
				System.out.println(id+""+name+"" +score);
		
			}
			
	   }
		public void rank()throws SQLException
		{
			String select="select * from vovel.user";
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(select);
		
	  
		}
		
	}
		


