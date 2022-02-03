package exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Finalset 
{

	public static void stringlength()
	{  
	      
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string to find no of words that contains : "); 
	      String s =in.nextLine();
	      System.out.println(s.length());  
	   }  
	
	public static void prime()
	{  
	      
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter number to check: " ); 
	      int num =in.nextInt();
	      int i=2, count =0;
	    
	      for( i=2;i<num;i++) 
	      {
	    	if(num%i==0)
	    	{
	    	 count++;
	    	}
	    	
	      }
	    	if(count == 0) 
	    	
	    	 System.out.print(" Prime"+ num);
	    	 else 
	    	 System.out.print("Not Prime");	
	      	  
	}
	    	  
	public static void DateTime()
	{   
	     System.out.println(LocalDateTime.now());  

	}
	
	public static void main(String[] args)
	{
		//stringlength();
		 prime();
		//DateTime();
	}

}
