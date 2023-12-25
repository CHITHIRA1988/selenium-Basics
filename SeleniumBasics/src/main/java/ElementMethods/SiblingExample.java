package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement checkBox=driver.findElement(By.xpath("//label[contains(text(), 'Click on this check box')]//preceding-sibling::input"));
	//WebElement checkBox=driver.findElement((By.xpath("(//label[@class='form-check-label'])[1]")));
	//WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkBox.click();
	}

}
