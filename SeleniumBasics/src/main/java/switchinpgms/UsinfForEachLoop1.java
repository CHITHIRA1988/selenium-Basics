package switchinpgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinfForEachLoop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.manage().window().maximize();
	WebElement followAll=driver.findElement(By.xpath("//a[@id='windowMulti']"));
	followAll.click();
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
	Set<String> windows=driver.getWindowHandles();
	for(String id:windows)
	{
		if(id.equals(parentWindow))
		{
			System.out.println("no need to switch");
		}
		else
		{
			driver.switchTo().window(id);
		}
	}
	WebElement joinNow=driver.findElement(By.xpath("//a[@class='nav__button-tertiary btn-md btn-tertiary']"));
	String joinNow1=joinNow.getText();
	System.out.println(joinNow1);
	driver.manage().window().maximize();
	}
}
