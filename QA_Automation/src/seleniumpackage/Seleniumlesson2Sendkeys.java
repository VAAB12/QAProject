package seleniumpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlesson2Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
WebDriver obj1 = new ChromeDriver();
obj1.get("http://www.training.qaonlinetraining.com/testPage.php");
obj1.findElement(By.name("name")).sendKeys("customera");
obj1.findElement(By.name("email")).sendKeys("customera@gmail.com");
obj1.findElement(By.name("website")).sendKeys("http://www.customera.com");
obj1.findElement(By.name("comment")).sendKeys("customera list");	
obj1.findElement(By.name("submit")).click();	
obj1.close();
	}

}
