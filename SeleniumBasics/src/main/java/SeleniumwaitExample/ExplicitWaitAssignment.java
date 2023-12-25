package SeleniumwaitExample;

import java.time.Duration;
//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement getNewUser=driver.findElement(By.xpath("//button[@id='save']"));
	wait.until(ExpectedConditions.elementToBeClickable(getNewUser));
	getNewUser.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='card-body'])[2]")));
	WebElement printName=driver.findElement((By.xpath("(//div[@class='card-body'])[2]")));
    String s=printName.getText();
    System.out.println(s);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='card-text text-center p-3']")));
	WebElement emailId=driver.findElement((By.xpath("//p[@class='card-text text-center p-3']")));
    String s1=emailId.getText();
    System.out.println(s1);
		
	}

}
