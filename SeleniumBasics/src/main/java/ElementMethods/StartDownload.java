package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
	driver.manage().window().maximize();
	WebElement startDownload=driver.findElement(By.xpath("//button[@id='downloadButton']"));
	String download=startDownload.getText();
	System.out.println(download);
	startDownload.click();
	}

}
