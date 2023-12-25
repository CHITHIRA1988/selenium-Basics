package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTitleUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
String flipkart=driver.getTitle();
System.out.println(flipkart);
String url=driver.getCurrentUrl();
System.out.println(url);

	}

}
