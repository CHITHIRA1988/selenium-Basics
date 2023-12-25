package SeleniumwaitExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement start=driver.findElement((By.xpath("//button[text()='Start']")));
	wait.until(ExpectedConditions.elementToBeClickable(start));
	start.click(); 
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
	
	WebElement helloWorld=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	
    String s=helloWorld.getText();
    System.out.println(s);

	}

}
