package day8.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ca1Test2 {
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
	  }
	  

	  @Test
	  public void Test() throws InterruptedException {
		  String url="https://www.amazon.in/";
		  driver.get(url);
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  System.out.println("opened");
		  
		  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7418736104",Keys.ENTER);
		  Thread.sleep(7000);
		  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Charishmatic04",Keys.ENTER);
		  Thread.sleep(4000);
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[2]/div/div/div/a")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"Cancel-items_1\"]")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/form/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/p[1]/span/span/span/input")).click();
		  Thread.sleep(10000);
		  WebElement txt=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/h4"));
		  String str=txt.getText();
		  System.out.println("Deleted ALert Message "+str);
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
}
