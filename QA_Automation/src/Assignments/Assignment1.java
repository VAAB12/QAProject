package Assignments;
// In this selenium code we are going to  the following:
//1) If user can navigate from home page to shop page and vise versa
//2) If home page has three sliders
//3) Each image link under "New Arrivals section is working and user can navigate to that particular page and return back to home page
//4) if user can navigate to next page by clicking image button and if the user is able to add that book to cart/basket
//5) if user clicks description tab, check if he is able to view description of that book
//6) if user clicks review tab, check if any review about that book is available
//7) After adding the book to basket, the user should see the price of the book in the cart/basket
//-------------------------------------------------------------------------------------------------------------------------------------------
// Steps to perform . 
// 1. setup the property of chromedriver because we will perform testing chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page http://practice.automationtesting.in/
// 4. Find shop button using using findelement method and click it to navigate to shop page
// 5. Find home button in shop page and navigate back to home page
// 6. Find number of sliders in home page. Use while loop to count the number of slides and print
// 7. Use Thread. method to pause 3 sec before moving each slider image
// 8. Select each image under New Arrival and perform click
// 9. Check if each image is navigating to respective page and if the home button on each page is working 
// 10. Check if you are able to click "Add book to basket" and if the particular book is added to basket
// 11. Check if the user can see the price of book in the cart/basket
// 12. Check if the description tab below the book shows its description
// 13. Check if the review tab below the book shows the review about the book
// 14. Close the browser
//-------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver 
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver obj1= new ChromeDriver();
		// 3. Open the web page http://practice.automationtesting.in/
		obj1.get("http://practice.automationtesting.in/");
		// 4. Find shop button using using findelement method and click it to navigate to shop page
		WebElement e1=obj1.findElement(By.className("menu-item"));	
		e1.click();
		//Because of dynamic web popups the sop page doesnt load so using get method to open the page and continue nextsteps
		obj1.get("https://practice.automationtesting.in/shop/");
		// 5. Find home button in shop page and navigate back to home page or simply you can use navigate.back() as an alternative
	    WebElement e2=obj1.findElement(By.linkText("Home"));	
	    e2.click();
	    //obj1.get("http://practice.automationtesting.in/");
	    //--------------------------------------------------------------------------------------------------------------------------------------------------------
	    // 6. Find number of sliders in home page. Use while loop to count the number of slides and print
	    // Initialize an integer count to count the number of sliders
	      int count=1;
	    // Click arrow button on the slides to move to next slides
	       WebElement e3=obj1.findElement(By.xpath("//img[@class='n2-ow']"));
	    /*First method to find number of sliders
	      List<WebElement> e6=obj1.findElements(By.xpath("//div[@class='n2-ss-layers-container']"));
	      System.out.println("The class is "+e6.size());*/
	   //Second method to find number of sliders
	     List<WebElement> slider=obj1.findElements(By.className("n2-ss-layers-container"));
	     int slidercount=slider.size();
	     while(count<slidercount)
	     {
	        e3.click();
	        count++;
	        // 7. Use Thread. method to pause 3 sec before moving each slider image
	        Thread.sleep(3000);
	     }
	  //Print the number of slides
	     System.out.println("The total number of Slider= "+count);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	  // 8. Select each image under New Arrival and perform click
	  //Selenium Ruby book link
	    WebElement imagelink1=obj1.findElement(By.xpath("//img[@alt='Selenium Ruby']"));
	    imagelink1.click();
	 // We can use navigate.back() method as well to go to previous(Home) page
	    WebElement homeclick=obj1.findElement(By.linkText("Home"));
	    homeclick.click();
	
	  //Thinking in HTML book link
	    WebElement imagelink2=obj1.findElement(By.xpath("//img[@alt='Thinking in HTML']"));
	    imagelink2.click();
	 // We can use navigate.back() method as well to go to previous(Home) page
	    WebElement homeclick1=obj1.findElement(By.linkText("Home"));
	    homeclick1.click();
	
	// Managing Javascript book link
	   WebElement imagelink3=obj1.findElement(By.xpath("//img[@alt='Mastering JavaScript']"));
	   imagelink3.click();
	// We can use navigate.back() method as well to go to previous(Home) page
	   WebElement homeclick3=obj1.findElement(By.linkText("Home"));
	   homeclick3.click();
	//-------------------------------------------------------------------------------------------------------
    // 10. Check if you are able to click "Add book to basket" and if the particular book is added to basket
	   WebElement imagelink11=obj1.findElement(By.xpath("//img[@alt='Selenium Ruby']"));
	   imagelink11.click();
	// 11. Check if the user can see the price of book in the cart/basket
       obj1.findElement(By.className("single_add_to_cart_button")).click();
    // 12. Check if the description tab below the book shows its description
       obj1.findElement(By.linkText("Description")).submit();
       WebElement rev1=obj1.findElement(By.xpath("//a[@href='Reviews']"));
    //WebElement tab1=obj1.findElement(By.className("reviews_tab"));
       rev1.click();
       obj1.close();
	}
	
}
