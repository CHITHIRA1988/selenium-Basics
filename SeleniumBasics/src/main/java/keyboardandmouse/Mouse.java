package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//WebElement helloSignIn=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	Actions action=new Actions(driver);
	//action.moveToElement(helloSignIn).build().perform();//to mouseover to an element
	//action.clickAndHold(helloSignIn).build().perform();//to click and hold a page
	//action.release(helloSignIn).build().perform();//to release the clickedelement
	WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	action.sendKeys(searchField,"perfume").build().perform();//to send value to afield
	action.keyDown(searchField,Keys.ENTER).build().perform();//to press enter key
	}

}
