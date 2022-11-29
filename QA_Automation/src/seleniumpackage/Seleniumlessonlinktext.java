package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlessonlinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver t12 =new ChromeDriver();
t12.get("https://www.google.com");
WebElement a = t12.findElement(By.linkText("Gmail"));
if( a.isDisplayed())
{System.out.println("it is link");}
else
{System.out.println("it is normal label");
}}

}
