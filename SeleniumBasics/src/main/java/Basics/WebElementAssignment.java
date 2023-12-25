package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	WebElement enterValueA=driver.findElement(By.id("value-a"));
	WebElement enterValueB=driver.findElement(By.id("value-b"));
	//WebElement submitButton=driver.findElement(By.id("button-two"));
	WebElement enterMessage=driver.findElement(By.className("form-control"));
			enterValueA.sendKeys("Chithira");
	enterValueB.sendKeys("abcd");
	enterMessage.sendKeys("chithira");

	
	//enterValueA.click();
	//enterValueB.click();
	//enterValueA.clear();
	//enterValueB.clear();
	
	}

}