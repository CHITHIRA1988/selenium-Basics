package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	enterValueA.sendKeys("10");
	WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	enterValueB.sendKeys("20");
	WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotal.click();
	WebElement total=driver.findElement(By.xpath("(//div[@class='my-2'])[2]"));
	String total1=total.getText();
	System.out.println(total1);
	}

}
