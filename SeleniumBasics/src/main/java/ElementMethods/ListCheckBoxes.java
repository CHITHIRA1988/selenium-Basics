package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	List<WebElement> checkBox=driver.findElements(By.xpath("//div[@class='form-group']//div[@class='form-check']//label"));
	for(int i=0;i<checkBox.size();i++)
	{
		String label=checkBox.get(i).getText();
		System.out.println(label);
	}

	}

}
