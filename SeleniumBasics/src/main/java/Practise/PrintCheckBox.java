package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	WebElement checkBoxZero=driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]"));
	String checkBoxZeroText=checkBoxZero.getText();
	System.out.println(checkBoxZeroText);
	WebElement checkBoxOne=driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]"));
	String checkBoxOneText=checkBoxOne.getText();
	System.out.println(checkBoxOneText);
	
	}
}