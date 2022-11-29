package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlesson7socialclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
WebDriver abcdef = new ChromeDriver();
abcdef.get("https://www.itlearn360.com/");
abcdef.findElement(By.className("fa-facebook")).click();
abcdef.navigate().back();
abcdef.findElement(By.className("fa-twitter")).click();
abcdef.navigate().back();
abcdef.findElement(By.className("fa-instagram")).click();
abcdef.navigate().back();
abcdef.findElement(By.className("fa-youtube")).click();
abcdef.navigate().back();
abcdef.findElement(By.className("fa-linkedin")).click();
abcdef.navigate().back();
abcdef.close();
	}

}
