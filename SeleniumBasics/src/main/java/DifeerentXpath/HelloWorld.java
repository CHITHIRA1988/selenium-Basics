package DifeerentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
    driver.manage().window().maximize();
    WebElement enterMessage=driver.findElement(By.xpath("//input[@class='form-control']"));
    enterMessage.sendKeys("Hello World");
    WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
    showMessage.click();
    
	}

}
