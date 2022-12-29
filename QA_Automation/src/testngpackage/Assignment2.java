package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment2 {
 // @Test(dataProvider = "data1")
  public void loginfeature(String username1,String password1) {
	  System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
  WebDriver obj1=new ChromeDriver();
	  obj1.get("https://www.itlearn360.com/");
	  WebElement lgnbttn = obj1.findElement(By.xpath("//*[@id=\"loginlabel\"]"));
	  lgnbttn.click();
	  
  }
}
