package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlesson11radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		WebDriver ob1 = new ChromeDriver();
		ob1.get("http://training.qaonlinetraining.com/testPage.php");
				ob1.findElement(By.name("name")).sendKeys("customera");
		ob1.findElement(By.name("email")).sendKeys("customera@gmail.com");
		ob1.findElement(By.name("website")).sendKeys("http://www.customera.com");
		ob1.findElement(By.name("comment")).sendKeys("customera list");	
		WebElement wbf= ob1.findElement(By.xpath("//input[@value='female']"));
		wbf.click();
		WebElement wbm= ob1.findElement(By.xpath("//input[@value='male']"));
		wbm.click();
		WebElement wbo= ob1.findElement(By.xpath("//input[@value='Other']"));
		wbo.click();
		ob1.findElement(By.name("submit")).click();

	}

}
