package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlesson6navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
WebDriver xyzobj = new ChromeDriver();
xyzobj.get("https:\\www.facebook.com");
System.out.println("the title of this website is "+xyzobj.getTitle());
System.out.println("url is "+xyzobj.getCurrentUrl());
xyzobj.navigate().to("https:\\twitter.com");

System.out.println("the title of this website is "+xyzobj.getTitle());
System.out.println("url is "+xyzobj.getCurrentUrl());
xyzobj.navigate().to("https:\\instagram.com");
System.out.println("the title of this website is "+xyzobj.getTitle());
System.out.println("url is "+xyzobj.getCurrentUrl());
xyzobj.close();
	}

}
