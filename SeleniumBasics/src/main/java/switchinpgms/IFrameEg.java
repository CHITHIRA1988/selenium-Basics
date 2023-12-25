package switchinpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	driver.switchTo().frame("frame-left");
	WebElement left=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
	String s=left.getText();
	System.out.println(s);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.switchTo().frame("frame-middle");
	WebElement middle=driver.findElement(By.xpath("//div[text()='MIDDLE']"));
	String s1=middle.getText();
	System.out.println(s1);
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame(1);
	//driver.switchTo().frame("frame-bottom");
	//WebElement bottom=driver.findElement((By.xpath("//body[contains(text(),'BOTTOM')]")));
	//String s2=bottom.getText();
	//System.out.println(s2);
	
	
	}

}
