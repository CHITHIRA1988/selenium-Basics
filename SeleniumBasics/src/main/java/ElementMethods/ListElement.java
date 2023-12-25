package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	List<WebElement> options=driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option"));
	for(int i=0;i<options.size();i++)
	{
		String text=options.get(i).getText();
		System.out.println(text);
	}
	List<WebElement> options1=driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-selected-list_duallistbox_demo1[]']//option"));
	for(WebElement option:options1)
	{
		String text1=option.getText();
	System.out.println(text1);
	}
	}

}
