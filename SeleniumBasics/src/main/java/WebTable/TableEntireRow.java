package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEntireRow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	List<WebElement> salary=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
	for(int i=0;i<salary.size();i++)
	{
		String salaryPrint=salary.get(i).getText();
		System.out.println(salaryPrint);	
	}
	

	}

}
