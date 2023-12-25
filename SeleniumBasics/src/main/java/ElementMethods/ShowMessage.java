package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/date-picker.php");
	driver.manage().window().maximize();
	WebElement showDate=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
	String showDate1=showDate.getAttribute("id");
	System.out.println(showDate1);
	String showDate2=showDate.getAttribute("class");
	System.out.println(showDate2);
	}
}
