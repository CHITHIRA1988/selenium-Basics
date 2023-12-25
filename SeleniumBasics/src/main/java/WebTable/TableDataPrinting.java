package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataPrinting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	WebElement airiSatuo=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[1]"));
	String airiSatuoPrint=airiSatuo.getText();
	System.out.println(airiSatuoPrint);
	WebElement herroldChandler=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[6]"));
	String herroldChandlerSalary=herroldChandler.getText();
	System.out.println(herroldChandlerSalary);
	
	}

}
