package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClickAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	driver.manage().window().maximize();
	WebElement radioButton1=driver.findElement(By.cssSelector(".form-check-input"));
	radioButton1.click();
	WebElement radioButton2=driver.findElement(By.cssSelector("#inlineRadio2"));
	radioButton2.click();
	}

}
