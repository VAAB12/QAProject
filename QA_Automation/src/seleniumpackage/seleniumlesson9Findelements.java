package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlesson9Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		WebDriver obj1 = new ChromeDriver();
		obj1.get("http://www.google.com/");
		int count=0;
		List<WebElement> a=obj1.findElements(By.tagName("a"));
		
		for (WebElement link : a) {
	          
            System.out.println(link.getAttribute("href"));
            count ++;
            
        }
	//7. Calculate number of links and print in all.
        System.out.println("total number of links present: "+count);
	
	//8. Closing the driver using close method.
        obj1.close();
	}

}
