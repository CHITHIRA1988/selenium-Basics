package SeleniumwaitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	WebElement start=driver.findElement((By.xpath("//button[text()='Start']")));
	start.click(); 
	Thread.sleep(7000);
	WebElement helloWorld=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
    String s=helloWorld.getText();
    System.out.println(s);
	}

}
