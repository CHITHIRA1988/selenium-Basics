package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/select-input.php");
			WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectColor);
			//select.selectByIndex(2);
			//select.selectByValue("Yellow");
			select.selectByVisibleText("Yellow");
			
	}

}
