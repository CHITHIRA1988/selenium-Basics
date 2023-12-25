package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	WebElement checkBox1=driver.findElement(By.cssSelector("#check-box-one"));
	checkBox1.click();
	WebElement checkBox2=driver.findElement(By.cssSelector("#check-box-two"));
	checkBox2.click();
	WebElement checkBox3=driver.findElement(By.cssSelector("#check-box-three"));
	checkBox3.click();
	WebElement checkBox4=driver.findElement((By.cssSelector("#check-box-four")));
	checkBox4.click();

	}

}
