package com.vovel.play;
import java.sql.SQLException;
import java.util.Scanner;


public class play
{
	
	public static void main(String args[])
	{ 
		
		System.out.println("enter 1 to play Game");
		System.out.println("enter 2 to display user and score");
		System.out.println("enter 3 to exit");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
		switch (val)
		{
		
		    case 1:      
			                   main pl=new main();
			                   pl.play();
				
										
			case 2:         try {
					
									uploadscore obj=new uploadscore();
									obj.initDB();
									obj.select();
		
								}
				
							catch(SQLException e)
									
									{
										e.printStackTrace();
									}
			
								break;
								
			case 3:		
						System.out.println("The game is End");
						break;
							
		}
		
					
				
	}//main close
	
	
	
	
	
	}//class close
	
	


