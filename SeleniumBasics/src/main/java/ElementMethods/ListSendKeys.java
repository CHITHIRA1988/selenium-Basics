package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ListSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/form-submit.php");
	driver.manage().window().maximize();
	List<WebElement> enterInput=driver.findElements(By.xpath("//div[@class='form-row']//input"));
	for(int i=0;i<enterInput.size();i++)
	{
		enterInput.get(i).sendKeys("chithira");
	}

	}

}
