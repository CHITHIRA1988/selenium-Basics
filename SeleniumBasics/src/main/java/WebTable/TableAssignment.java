package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	WebElement salary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[6]"));
	String s=salary.getText();
	System.out.println(s);
	List<WebElement> tableFooter=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
	System.out.println(tableFooter.size());
	for(int i=0;i<tableFooter.size();i++)
	{
		String footerText=tableFooter.get(i).getText();
		System.out.println(footerText);
	}
	

	}

}
