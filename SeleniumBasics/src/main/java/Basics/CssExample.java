package Basics;

import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	//driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	//driver.manage().window().maximize();
	//WebElement enterMessage=driver.findElement(By.cssSelector("#single-input-field"));
	//WebElement enterMessage=driver.findElement(By.cssSelector(".form-control"));
	//enterMessage.sendKeys("chithira");
	//driver.get("https://www.amazon.in/");
	//driver.manage().window().maximize();
	//WebElement searchField=driver.findElement(By.cssSelector(".nav-input.nav.progressive-attribute"));
	//searchField.sendKeys("chithira");
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//WebElement enterMessage=driver.findElement(By.cssSelector("#single-input-field"));
	WebElement emailId=driver.findElement(By.cssSelector(".inputtext._55r1._6luy"));
	WebElement password=driver.findElement(By.cssSelector("#pass"));
	password.sendKeys("password");
	emailId.sendKeys("chithira");
	WebElement login=driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
	login.click();
		}
}
