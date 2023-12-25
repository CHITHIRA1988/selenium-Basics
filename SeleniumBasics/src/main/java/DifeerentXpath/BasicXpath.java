package DifeerentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
    WebElement emailIdField=driver.findElement(By.xpath("//input[@id='email']"));
    emailIdField.sendKeys("Chithira");
	WebElement password=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
	password.sendKeys("My Id");
	WebElement logIn=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	logIn.click();
	}

}

