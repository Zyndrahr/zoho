package techpro;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class vendora 
{
	
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(vendora.class);
	
	 
	 @Test(dataProvider = "dp",priority=0)
	  public void Logintest(String Login,String pass)
	  {
		  
		   driver.get("http://52.44.68.99:8086/buyer");
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Login);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  System.out.println("Invalid credentials and Not logged in ");
	  }
    
	  @DataProvider
	  public Object[][] dp() throws IOException
	  {
	   
	   DDF1 dd = new DDF1("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\Logintest.xlsx");
	   int totalrow = dd.rowcount(0);
	   Object[][]data = new Object[totalrow][2];
	   for(int i=0;i<totalrow;i++) 
	   {
		   data[i][0]=dd.getdata(0, i, 0);
		   data[i][1]=dd.getdata(0, i, 1);
	   }
	   return data;
	    
	  }
	  
	  @Test(priority=1)
		public void Assertion() throws Exception
		{
		  
		  log.info("login sucessful");
		  System.out.println("Login sucessful ");
		  File fi3 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi3,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\Dashboard.png"));
		   Assert.assertTrue(true);
	       String ExpectedTitle ="Dashboard | Vendor Portal";
	       Assert.assertEquals(ExpectedTitle, driver.getTitle());
	       System.out.println("Assertion test is passed ");
	       log.info("assertion passed");
		}
	  
	  @Test(priority=2)
		public void Search() throws IOException
		{
		  
		  Search sp = PageFactory.initElements(driver, Search.class);
		  sp.Reports();
		  log.info("Reports selected");
		  File fi4 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi4,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\Reports.png"));
		  sp.PendingPo();
		  log.info("Pending po selected");
		  File fi5 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi5,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\po.png"));
		  sp.showfilter();
		  log.info("showfilter selected");
		  File fi6 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi6,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\filter.png"));
			
	   	}
	  
	  @Test(priority=3)
		public void Locationwise() throws IOException 
		{
		  
		  Search sp = PageFactory.initElements(driver, Search.class);
		  sp.Location();
		  log.info("location selected");
		  sp.sumbit();
		  File fi =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\Locationwise.png"));
		  System.out.println("Locationwise captured ");
		  
		}
	  
      @Test(priority=4)
         public void Vendorwise() throws IOException, InterruptedException 
		{
			  
	      Search sp = PageFactory.initElements(driver, Search.class);	 
		  sp.vendor();
		  log.info("vendor selected");
		  WebElement dropdown = driver.findElement(By.xpath("//select[@id='vendor-id']"));
	      Select d1= new Select(dropdown);
	     
	      List<WebElement> options = d1.getOptions();
	      for (WebElement option : options)
	      {
	    	  System.out.println(option.getText());
	    	  option.click();
	      }
	      
		  sp.sumbit();
		  System.out.println("vendor selected");
		  File fi2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fi2,new File("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\src\\techproscreenshot\\vendorwise.png"));
		  System.out.println("vendorwise captured ");
		
		}
    
  	
  @BeforeClass
  public void beforeClass() throws Exception 
  {
	 PropertyConfigurator.configure("C:\\Users\\HAWKEYE\\eclipse-workspace\\Anglertechpro\\log4j.properties");
	 ScreenRecorderUtil.startRecord("beforeClass");

	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium Jars\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       log.info("window initiated");
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  ScreenRecorderUtil.stopRecord();
	  log.info("window quitted");
	  driver.quit();
  }

}
