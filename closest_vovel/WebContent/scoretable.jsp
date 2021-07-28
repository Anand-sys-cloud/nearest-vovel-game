
package com.vovel.play;
<%
try
{
int id=request.getint(id);
String name=request.getString(name);
int score=request.getScore(score);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vovel","root","root");
		Statement	stmt=con.createStatement();
			//System.out.println("Getting connected to the vovel database");

			String select="select * from vovel.user";
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(select);
			while(res.next()==true)
			{
				int id=res.getInt(1);
				String name=res.getString(2);
				int score=res.getInt(3);
				System.out.println(id+""+name+"" +score);
		
			}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		


%>