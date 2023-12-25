package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	driver.manage().window().maximize();
	WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	boolean male1=male.isDisplayed();
    System.out.println(male1);
    WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
    boolean female1=female.isDisplayed();
    System.out.println(female1);
	}

}
