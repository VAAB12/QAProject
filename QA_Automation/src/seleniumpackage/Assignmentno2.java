package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver obj1=new ChromeDriver();
obj1.get("http://demo.itlearn360.com/");
obj1.findElement(By.id("loginlabel")).click();
obj1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement a=obj1.findElement(By.id("user_login"));
a.sendKeys("Demo12");
WebElement c=obj1.findElement(By.id("user_pass"));
c.sendKeys("Test123456$");
obj1.findElement(By.name("wp-submit")).click();
obj1.findElement(By.className("lg_button")).click();
//obj1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

obj1.findElement(By.linkText("Offered Academies")).click();
obj1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
obj1.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[4]/form/div/button")).click();
//obj1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
obj1.findElement(By.name("payment_method")).click();

//WebElement radio1=obj1.findElement(By.xpath("//*[@id=\"payment_method_stripe\"]"));
//obj1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//radio1.click();
obj1.close();


	}

}
