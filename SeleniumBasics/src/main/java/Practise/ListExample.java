package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/index.php");
	List<WebElement> menuLabels=driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
	System.out.println(menuLabels.size());
	String s=menuLabels.get(3).getText();
	System.out.println(s);
	for(int i=0;i<menuLabels.size();i++)
	{
		String s1=menuLabels.get(i).getText();
		System.out.println(s1);
		String s2=menuLabels.get(i).getAttribute("href");
		System.out.println(s2);
	}
	
	for(WebElement labels:menuLabels)
	{
		System.out.println(labels.getText());
	}
	}

}
