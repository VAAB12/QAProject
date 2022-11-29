package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
WebDriver obj1 = new ChromeDriver();
obj1.get("http://google.com");
WebElement a = obj1.findElement(By.linkText("Images"));
if (a.isDisplayed())
	{System.out.println("link is there"+a);}
	else
	{System.out.println("link not there");}
//obj1.close();
	}

}
