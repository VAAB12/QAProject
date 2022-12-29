package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver 
				System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
				// 2. Initialize WebDriver object through ChromeDriver class.
				WebDriver obj1= new ChromeDriver();
				// 3. Open the web page http://practice.automationtesting.in/
				obj1.get("https://www.itlearn360.com/");
				Object browser;
			// 4. Find shop button using using findelement method and click it to navigate to shop page
				WebElement e1=obj1.findElement(By.xpath("//*[@id=\"loginlabel\"]"));	
				e1.click();
				Alert alert1 = obj1.switchTo().alert();
				WebElement ee1=obj1.findElement(By.xpath("//*[@id=\"loginbox\"]"));
				alert1.accept();
				ee1.click();
				//Because of dynamic web popups the sop page doesnt load so using get method to open the page and continue nextsteps
				obj1.findElement(By.id("user_login")).sendKeys("vasundara");
				obj1.findElement(By.id("user_pass")).sendKeys("Rutgers1815");
			      obj1.findElement(By.className("lg_button")).click();
					WebElement q=obj1.findElement(By.name("log"));
					q.click();
					q.sendKeys("vasundara");
					obj1.findElement(By.name("pwd")).sendKeys("Rutgers1815");
					obj1.findElement(By.name("wp-submit")).submit();
				WebElement x=obj1.findElement(By.name("search_course"));
				x.sendKeys("python");
				x.submit();
				obj1.get("https://www.itlearn360.com/get-started/");
				WebElement yy=obj1.findElement(By.className("lg_button"));
				yy.click();
				
				//*[@id="primary_menu"]/nav[1]/form/input
				
				obj1.findElement(By.xpath("//*[@id='login-list']")).click();
				obj1.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click();
				obj1.findElement(By.xpath("//*[@id='tab-academies']/div/div/ul/li[1]/form/div/button")).click();
				WebElement wbf= obj1.findElement(By.xpath("//input[@value='stripe']"));
				wbf.click();
				obj1.findElement(By.xpath("//*[@id='learn-press-checkout-place-order']")).submit();
				obj1.findElement(By.xpath("//*[@id='root']/form/div/div[2]")).sendKeys("12345678912");
				obj1.findElement(By.xpath("//*[@id='root']/form/div/div[2]/span[2]/span/span/input")).sendKeys("09/08");
				obj1.findElement(By.xpath("//*[@id='root']/form/div/div[2]/span[4]/span/span/input")).sendKeys("12344");
				obj1.findElement(By.className("btn-primary")).submit();
				
	}

}
