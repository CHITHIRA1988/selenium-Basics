package DifeerentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//WebElement forgottenPassword=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));
	//forgottenPassword.click();
	//WebElement forgottenPassword=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));
	//forgottenPassword.click();
	WebElement href=driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/recover')]"));
	href.click();
    driver.get("https://selenium.obsqurazone.com/index.php");
    WebElement alerts=driver.findElement(By.xpath("//a[starts-with(@id,'alert')]"));
    alerts.click();

	}

}
