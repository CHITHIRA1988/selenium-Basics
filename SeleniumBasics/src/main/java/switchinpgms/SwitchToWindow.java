package switchinpgms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.manage().window().maximize();
	WebElement followAll=driver.findElement(By.xpath("//a[@id='windowMulti']"));
	followAll.click();
	String title=driver.getTitle();
	System.out.println(title);
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
	Set<String> windows=driver.getWindowHandles();
	//int size=windows.size();
	//System.out.println(size);
	Iterator<String> iterate= windows.iterator();
	while(iterate.hasNext())
	{
		String id=iterate.next();
		if(!(id.equals(parentWindow)))
		{
			driver.switchTo().window(id);
			
		}
	}
	WebElement firstWindowText=driver.findElement((By.xpath("//a[@class='nav__button-tertiary btn-md btn-tertiary']")));
	String s=firstWindowText.getText();
	System.out.println(s);
	driver.manage().window().maximize();
	
	
	}

}
