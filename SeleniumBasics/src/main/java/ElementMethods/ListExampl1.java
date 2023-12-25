package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExampl1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	List<WebElement> checkBox=driver.findElements(By.xpath("//div[@class='form-group']//div[@class='form-check']//input"));
	for(int i=0;i<checkBox.size();i++)
	{
	checkBox.get(i).click();
		Thread.sleep(2000);	
	}
	List<WebElement> checkBoxLabel=driver.findElements(By.xpath("//div[@class='form-group']//div[@class='form-check']//label"));
	for(int i=0;i<checkBoxLabel.size();i++)
	{
	String s=checkBoxLabel.get(i).getText();
	System.out.println(s);
	}
}
}
