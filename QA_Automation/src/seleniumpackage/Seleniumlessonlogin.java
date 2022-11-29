package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlessonlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stubnull
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		WebDriver obj1 = new ChromeDriver();
		obj1.get("https://admin-demo.nopcommerce.com/login\r\n");
		WebElement email=obj1.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement password=obj1.findElement(By.name("Password"));
		password.clear();
		password.sendKeys("admin");
		obj1.findElement(By.className("button-1")).submit();
	}

}
