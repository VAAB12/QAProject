package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlessonwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver obj1= new ChromeDriver();
obj1.get("https://admin-demo.nopcommerce.com/login");

WebElement a=obj1.findElement(By.id("Email"));
a.clear();
WebElement b=obj1.findElement(By.id("Password"));
b.clear();
a.sendKeys("admin@yourstore.com");
b.sendKeys("admin");
WebElement c=obj1.findElement(By.className("button-1"));
c.submit();

	}

}
