package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableIndividual {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
    driver.manage().window().maximize();
    List<WebElement> cedricKelly=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
    for(int i=0;i<cedricKelly.size();i++)
    {
    String cedricKellyPrint=cedricKelly.get(i).getText();
    System.out.println(cedricKellyPrint);

	}
	}
}
