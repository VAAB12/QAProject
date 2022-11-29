package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver browserObject1 = new ChromeDriver();
browserObject1.get("http://www.google.com/");


	}

}
