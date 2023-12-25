package coremethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBocExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
    driver.manage().window().maximize();
    JavascriptExecutor js=(JavascriptExecutor) driver;
    WebElement checkBoxOne=driver.findElement(By.xpath("(//input[@class='check-box-list'])[1]"));
    js.executeScript("arguments[0].click();",checkBoxOne);
	}

}
