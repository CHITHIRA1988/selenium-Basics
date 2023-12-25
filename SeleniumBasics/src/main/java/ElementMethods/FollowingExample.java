package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
	WebElement startDownload=driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12']//img[@src='images/logo.png']//following::button[@id='downloadButton']"));
	startDownload.click();	
	}

}
