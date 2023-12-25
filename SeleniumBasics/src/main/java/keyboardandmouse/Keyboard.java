package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//searchField.sendKeys("laptop"+Keys.ENTER);
	searchField.sendKeys("mobiles");
	searchField.sendKeys(Keys.BACK_SPACE);
	searchField.sendKeys(Keys.chord(Keys.CONTROL,"A"));
	//searchField.sendKeys(Keys.BACK_SPACE);
	

	}

}
