package techpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search 

{
	@FindBy(xpath="//a[text()=\"Reports \"]") private WebElement Reports1;
	
	@FindBy(xpath="//a[text()=\"Pending P.Os\"]") private WebElement PendingPo1;
	
	@FindBy(xpath="//button[@class=\"btn btn-success showFilter\"]") private WebElement showfilter1;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/ul[1]") private WebElement Location1;
	@FindBy(xpath="//li[contains(text(),'2011')]") private WebElement place;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]") private WebElement vendor1;
	
	
	@FindBy(xpath="//button[text()='Filter']") private WebElement sumbit1;
	
	public void Reports()
	{
		Reports1.click();
		System.out.println("Reports clicked");
		
	}
	
	public void PendingPo()
	{
		PendingPo1.click();
		System.out.println("PendingPo clicked");
		
	}
	
	public void showfilter()
	{
		showfilter1.click();
		System.out.println("Showfilter clicked");
		
	}
	
	public void Location()
	{
		Location1.click();
		place.click();
		System.out.println("Location selected");
		
	}
	
	public void vendor() throws InterruptedException 
	{
		vendor1.click();
		 
	}
	
	public void sumbit() 
	{
		sumbit1.click();
		
	}

}
