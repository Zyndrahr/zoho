package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {	
	
	public static void calculator()
	
	{
	    Double number1, number2, result;
	    
	    Scanner input = new Scanner(System.in);

	    System.out.println("Choose an operator: +, -, *, or /");
	    char operator=input.next().charAt(0);
	    
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();
	  
	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) 
	    {
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	        
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
   
	}
	
	public static void stringreverse()
	{  
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		StringBuffer sb = new StringBuffer(in.nextLine());
		StringBuffer sb2=sb.reverse();
		System.out.println(sb);
		if (sb.equals(sb2))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome."); 
	   }  
	
	
	
	public static void stringpalindrome()
	{  
	      String reverse="";
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      String original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);
	      System.out.println(reverse);
	      if (original.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
	   } 
	
	public static void Arraysorting()
	{  
		  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a no of Arrays to sort :");
	       String [] s = new String[in.nextInt()];
	       Scanner in2 = new Scanner(System.in);
		  for( int i = 0; i <s.length; i++)
	        {
			  s[i]=in2.nextLine();    
	        }
		  Arrays.sort(s);
		  for(String name:s) {	  
		  System.out.println("Ascend order: " + name);
		  }
	   }  
	
	   

	public static void sqroot()
	
	 {
		Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a no to find square root :");
	     double a = in.nextInt();
	        System.out.println(Math.sqrt(a));
	 }
	
	public static void sqroot2()
	
	 {
		Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a no to find square root :");
	     double a = in.nextInt();
	        System.out.println( Math.pow(a,0.5));
	 }
	
	public static void main(String[] args) 
	{	
      //calculator();
     stringreverse();
      //stringpalindrome();
		//Arraysorting();
		//sqroot();
		 //sqroot2();
	}

}	

