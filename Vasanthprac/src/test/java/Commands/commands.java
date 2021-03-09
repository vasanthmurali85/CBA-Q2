package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Initiation.Initiatebrowser;

public class commands {
	
	WebDriver driver;
	
	public commands()
	{
		driver = Initiatebrowser.driver1;
	}
	
	public void navigate(String url)
	{
		driver.get(url);
	}
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	public void enterkets(By locator, String txt)
	{
		driver.findElement(locator).sendKeys(txt);
	}
	
	public boolean isenabledcheck(By locator)
	{
		boolean k1 = driver.findElement(locator).isEnabled();
		return k1;
	}
	
	public String gettext(By locator)
	{
	String s1 = driver.findElement(locator).getText();
	return s1;
	
	}
	
	public boolean isselectedcheck(By locator)
	{
		boolean sel1 = driver.findElement(locator).isSelected();
		return sel1;
	}

}
