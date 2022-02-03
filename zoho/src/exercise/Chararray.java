package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chararray 
{

	public static void charsort()
	{
		 int a;
	     int size;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the string :");
	     String str = sc.nextLine();
	     char []c = str.toCharArray();
	     size = c.length;
	     for(int i=0;i<size;i++) 
	     {
	    	 for(int j=i+1;j<size;j++) 
	    	 {
	    		 if(c[i]>c[j])           
	    		 {
	    			 a=c[i];
	    			 c[j]=c[i];
	    			 c[j]= (char) a;
	    		 }
	    		 
	    	 }
	     }
	     System.out.println(c);
	}
	
	public static void ATM() 
	{
		 int balance = 5000, withdraw, deposit;
	        Scanner sc = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("Automated Teller Machine");
	            System.out.println("Choose 1 for Withdraw");
	            System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
	            System.out.println("Choose 4 for EXIT");
	            System.out.print("Choose the operation you want to perform:");
	            int n = sc.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("Enter money to be withdrawn:");
	                withdraw = sc.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your money");
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance");
	                }
	                System.out.println("");
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = sc.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	                case 4:
	                System.exit(0);
	            }
	        }
	    
	}
	
	public static void payscale() 
	{
		
		    double gs,it,pt,pf,netSalary;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter Gross salary");
	                   gs=sc.nextDouble();
		    System.out.println("enter Income Tax %");
	                   it=sc.nextDouble();
		    System.out.println("enter Professional Tax %");
	                   pt=sc.nextDouble();
		     System.out.println("enter Provident Fund %");
		pf=sc.nextDouble();
		     pf=gs*(pf/100);
		     it=gs*(it/100);
		     pt=gs*(pt/100);
		     netSalary=gs-it-pt-pf;
		     System.out.println("Net Salary is="+netSalary);
	                   
	}
	
	public static void Arraylist() 
	{
		List l= new ArrayList();
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		System.out.println(l); 
		System.out.println(l.contains("ramar"));
		System.out.println(l.toArray());
	                   
	}
	
	public static void ArrayDeque() 
	{
		List l= new ArrayList();
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		l.add("ramar");
		System.out.println(l); 
		System.out.println(l.contains("ramar"));
	                   
	}
	
	  public static void SimpleArrayList()
	  {
       
		  Scanner sc = new Scanner(System.in); 
	       List l = new ArrayList(); 
	       System.out.println("enter the string:");   
	       while(true)
	       {
	    	   l.add(sc.nextLine());
           }
	  }

      
 
 
    public static void main(String[] args)

   {
	//charsort();
	//ATM();
	//payscale();
    // Arraylist() ;
     SimpleArrayList();
	
	}

}
