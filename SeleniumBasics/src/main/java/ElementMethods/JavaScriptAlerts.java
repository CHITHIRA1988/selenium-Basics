package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	WebElement jsAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
	WebElement jsConfirm=driver.findElement((By.xpath("//button[text()='Click for JS Confirm']")));
	WebElement jsPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	jsAlert.click();
	driver.switchTo().alert().accept();
	jsConfirm.click();
	String alertText=driver.switchTo().alert().getText();
	//driver.switchTo().alert().accept();
	System.out.println(alertText);
	driver.switchTo().alert().dismiss();
	jsPrompt.click();
	driver.switchTo().alert().sendKeys("hello");
	driver.switchTo().alert().accept();
		}

}
