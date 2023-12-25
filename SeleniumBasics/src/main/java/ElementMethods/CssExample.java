package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
	driver.manage().window().maximize();
	WebElement autoClosableWarning=driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
	String autoClosableWarning1=autoClosableWarning.getCssValue("background-color");
	System.out.println(autoClosableWarning1);
	String autoClosableWarning2=autoClosableWarning.getCssValue("color");
	System.out.println(autoClosableWarning2);
	String autoClosableWarning3=autoClosableWarning.getCssValue("font-size");
	System.out.println(autoClosableWarning3);
	String autoClosableWarning4=autoClosableWarning.getCssValue("font-style");
	System.out.println(autoClosableWarning4);
	
	}

}
