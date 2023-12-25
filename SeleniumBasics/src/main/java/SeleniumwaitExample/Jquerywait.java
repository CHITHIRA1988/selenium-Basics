package SeleniumwaitExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jquerywait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement startDownload=driver.findElement(By.xpath("//button[@id='downloadButton']"));
	wait.until(ExpectedConditions.elementToBeClickable(startDownload));
	startDownload.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
	WebElement complete=driver.findElement(By.xpath("//div[text()='Complete!']"));
	String s=complete.getText();
	System.out.println(s);
	//WebElement cancelDownload=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));
	//wait.until(ExpectedConditions.invisibilityOf(cancelDownload));
	//cancelDownload.click();
	
	}
}