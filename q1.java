package day8.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ca1Test {
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
//	  System.out.println("opened");
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Rings",Keys.ENTER);
	  Thread.sleep(10000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/div/a[2]/div/div[1]/img")).click();
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div[1]/span/span/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
	  Thread.sleep(5000);
	  driver.navigate().to("https://www.amazon.in/dp/B09LM98LRT/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=b64f891a4fd6ae0703bbcb946aabe933&content-id=amzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9%3Aamzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9&hsa_cr_id=5574300390202&pd_rd_plhdr=t&pd_rd_r=5bafbc7a-2309-413e-b634-b7425bde9fa0&pd_rd_w=j7zzL&pd_rd_wg=KH7Ag&qid=1683189619&ref_=sbx_be_s_sparkle_lsi4d_asin_0_img&sr=1-1-e0fa1fdd-d857-4087-adda-5bd576b25987");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div[1]/form/span/span/span/input")).click();	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7418736104",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Charishmatic04",Keys.ENTER);
	  Thread.sleep(4000);
	  WebElement total=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[4]/td[2]"));
	  String ttotal=total.getText();
	  System.out.println("Order Total: "+ttotal);
	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/div/div[1]/div/div[2]/span/span/div/i[1]")).click();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}





 
