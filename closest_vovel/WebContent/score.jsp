<%@page import="java.sql.*"%>

<%


try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
	System.out.println("Connection established ");
	
	
		String select="select * from emp.sales";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(select);
		while(res.next()==true)
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			String place=res.getString(3);
			System.out.println(id+""+name+"" +place);
		}
	}


	catch(Exception e)
	{
	    response.sendRedirect("error.html");
	}
	

%>
