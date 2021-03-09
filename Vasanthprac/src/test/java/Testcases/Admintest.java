package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commands.commands;
import Initiation.Initiatebrowser;
import Pageobjects.pageobjects;

public class Admintest extends Initiatebrowser{
	
	@Test (priority = 10, groups = "Progression")
	public void t1() throws InterruptedException
	{
		commands com1 = new commands();
		com1.navigate("https://www.commbank.com.au/");
		com1.click(pageobjects.Repaymentcalc);
		driver1.findElement(pageobjects.loanamount).clear();
		com1.enterkets(pageobjects.loanamount, "100000");
		driver1.findElement(pageobjects.loanterm).clear();
		com1.enterkets(pageobjects.loanterm, "35");
		Select sel1 = new Select(driver1.findElement(pageobjects.repaymenttype));
		sel1.selectByValue("1");
		Select sel2 = new Select(driver1.findElement(pageobjects.witha));
		sel2.selectByValue("7784123");
		com1.click(pageobjects.calculate);
		Thread.sleep(5000);
		String txt1 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[1]/p/span[3]"));
		String txt2 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[2]/p/span[3]"));
		System.out.println(txt1);
		System.out.println(txt2);
	}
	
	
	@Test (priority = 20, groups ="Progression")
	public void t2() throws InterruptedException
	{
		commands com1 = new commands();
		com1.navigate("https://www.commbank.com.au/");
		com1.click(pageobjects.Repaymentcalc);
		driver1.findElement(pageobjects.loanamount).clear();
		com1.enterkets(pageobjects.loanamount, "3500000");
		driver1.findElement(pageobjects.loanterm).clear();
		com1.enterkets(pageobjects.loanterm, "45");
		Select sel1 = new Select(driver1.findElement(pageobjects.repaymenttype));
		sel1.selectByValue("4");
		Select sel2 = new Select(driver1.findElement(pageobjects.witha));
		sel2.selectByValue("7774123");
		Thread.sleep(5000);
		String txt1 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[1]/p/span[3]"));
		String txt2 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[2]/p/span[3]"));
		System.out.println(txt1);
		System.out.println(txt2);
	}
	
	
	@Test (priority = 30, groups = "Progression")
	public void t3() throws InterruptedException
	{
		commands com1 = new commands();
		com1.navigate("https://www.commbank.com.au/");
		com1.click(pageobjects.Repaymentcalc);
		driver1.findElement(pageobjects.loanamount).clear();
		com1.enterkets(pageobjects.loanamount, "1000000");
		driver1.findElement(pageobjects.loanterm).clear();
		com1.enterkets(pageobjects.loanterm, "45");
		Select sel1 = new Select(driver1.findElement(pageobjects.repaymenttype));
		sel1.selectByValue("2");
		Select sel2 = new Select(driver1.findElement(pageobjects.witha));
		sel2.selectByValue("7794123");
		Thread.sleep(5000);
		String txt1 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[1]/p/span[3]"));
		String txt2 = com1.gettext(By.xpath("//*[@id=\"repayments-app\"]/div[3]/div[1]/div/div[3]/div[3]/div[1]/div[2]/p/span[3]"));
		System.out.println(txt1);
		System.out.println(txt2);
	}

}
