package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://selenium.obsqurazone.com/index.php");
	driver.navigate().to("https://google.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
String currenturl=driver.getCurrentUrl();
System.out.println(currenturl);
}
}
