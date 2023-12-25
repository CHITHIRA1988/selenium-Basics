package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	driver.manage().window().maximize();
    Actions action=new Actions(driver);
    WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
    action.click(male).build().perform();
    driver.get("https://selenium.obsqurazone.com/select-input.php");
    WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
    action.click(selectColor).build().perform();
    
	}

}
