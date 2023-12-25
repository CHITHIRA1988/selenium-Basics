package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select select=new Select(dropDown);
	select.selectByIndex(3);
	select.selectByValue("search-alias=stripbooks");
	select.selectByVisibleText("Apps & Games");
	List<WebElement> option=select.getOptions();
	for(int i=0;i<option.size();i++)
	{
		System.out.println(option.get(i).getText());
	
	}
	}
}
