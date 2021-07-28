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
							int scores=0;
							int id=0;
						
							try {
								
										uploadscore obj=new uploadscore();
										obj.initDB();
										Scanner sc1=new Scanner(System.in);
										System.out.println("enter your name");
										String name=sc1.nextLine();
							
										System.out.println("Enter the First Character");
									    char first=sc.next().charAt(0);
									    scores=scores+score(first);
										
										System.out.println("Enter second character");
									    char second=sc.next().charAt(0);
										scores=scores+score(second);
										
										System.out.println("Enter Third character");
									    char third=sc.next().charAt(0);
									    scores=scores+score(third);
						   				
									    
						   				System.out.println("Total Score is"+scores);
						   	            int  score=scores;
						   	            obj.insert(id,name,score);
						   				
								}
									
							catch(SQLException e)
									
									{
										e.printStackTrace();
									}
									
						
								break;
								
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
	
	
	
	public static int score(char c)
	{
		int score=0;
		int stepval[]= {10,100,90,80,70,60,50,40,30,20} ;
	    String vovel="aeiou";
        int arr[]=new int[5];
        int x=0;int y=0;
        
        char[] v=vovel.toCharArray();
		
        for(int i=0;i<=v.length-1;i++)
		{  
			int min=0; int val=0;
			     // System.out.println(v[i]);
					if(c>v[i])
					{    
						  val=c-vovel.charAt(i);
					     // System.out.println(val);
					      
					}
	
					else if(c<v[i])
					{
						val=vovel.charAt(i)-c;
				        //System.out.println(val);
				        
					}
					
					for(int j=0;j<arr.length-1;j++)
					 {
					      	arr[i]=val;
					      	
					 }

		}
		
		for(int k=0;k<=arr.length-1;k++)
		{  
					int  res=arr[0];
					for(int l=1;l<=arr.length-1;l++)
					{
							if(res>arr[l])
							{
								res=arr[l];
							}
						
					}
					for(int l=0;l<stepval.length-1;l++)
					{
							if(res==l)
							{    
								
								x=stepval[l];
								
								
							}
							
					}
				
		 	
		}
	      System.out.println(x);
		
		return x;
		}//score close


	
	}//class close
	
	


