package exercise;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lastset {
	
	public static void IPaddress() throws UnknownHostException 
	{
		InetAddress IP = InetAddress.getLocalHost();
		 System.out.println(IP.getHostName());;
		 System.out.println(IP.getHostAddress());
		 System.out.println(" ");
		 
		InetAddress IP2 = InetAddress.getByName("www.watsup.com");
		 System.out.println(IP2.getHostName());;
		 System.out.println(IP2.getHostAddress());
		 System.out.println(" ");
		 
		 InetAddress IP3 = InetAddress.getByName("185.37.71.22");
		 System.out.println(IP3.getHostName());;
		 System.out.println(IP3.getHostAddress());
		 System.out.println(" ");
		 
	}
	public static void file() throws  UnknownHostException 
	{
		File f = new File("D:\\PERSONAL");
		File f2[] = f.listFiles();
	     System.out.println("List of files and directories in the specified directory:");
	     for(File file : f2) {
	         System.out.println("File name: "+file.getName());
	         System.out.println("File path: "+file.getAbsolutePath());
	         System.out.println("Size :"+file.getParent());
	         System.out.println(" ");
	      }
	}

	 public static void openapp() throws InterruptedException, IOException 
	 {
		 
			Process app = Runtime.getRuntime().exec("notepad.exe");
			Process app2 = Runtime.getRuntime().exec("Calc.exe");
	     	app.waitFor();
	     	app2.waitFor();
		    System.out.println("process exited !! ");
	}

	public static void main(String[] args) throws Exception 
	{
		//IPaddress();
		file();
		//openapp();
	}

}
