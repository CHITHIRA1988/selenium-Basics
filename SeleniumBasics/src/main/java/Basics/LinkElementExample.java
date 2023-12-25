package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkElementExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.get("https://www.amazon.in/");
	WebElement forgotPassword=driver.findElement(By.linkText("Forgotten password?"));
	forgotPassword.click();
	WebElement partialPassword=driver.findElement(By.partialLinkText("Forgotten "));
	partialPassword.click();
	//WebElement forgotPassword=driver.findElement(By.tagName("select"));
//forgotPassword.click();
	}
}