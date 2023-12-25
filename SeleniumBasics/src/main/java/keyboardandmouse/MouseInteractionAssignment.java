package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement searchField=driver.findElement(By.xpath("//div[@class='a4bIc']"));
	action.moveToElement(searchField).build().perform();
	//action.click(searchField).build().perform();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	WebElement likeUsOnFacebook=driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
	action.moveToElement(likeUsOnFacebook).build().perform();
	//action.click(likeUsOnFacebook).build().perform();
	
	
	}

}
