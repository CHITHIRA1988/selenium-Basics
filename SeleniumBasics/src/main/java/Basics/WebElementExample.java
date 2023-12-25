package Basics;

import org.openqa.selenium.By;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement searchField=driver.findElement(By.id("single-input-field"));
    //WebElement searchButton=driver.findElement(By.id("nav-search-submit nav-sprite"));
   searchField.sendKeys("toys");
   searchField.click();
   searchField.clear();
	}
	

}

