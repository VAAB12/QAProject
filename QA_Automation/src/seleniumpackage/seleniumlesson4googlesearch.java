package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlesson4googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver abc = new ChromeDriver();
abc.get("https://www.google.com");
abc.findElement(By.name("q")).sendKeys("python");
abc.findElement(By.name("btnK")).submit();
	}

}
