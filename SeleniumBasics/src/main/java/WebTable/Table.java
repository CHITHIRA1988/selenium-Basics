package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	WebElement age=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[4]"));
	String age1=age.getText();
	System.out.println(age1);
	WebElement position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[2]"));
	String position1=position.getText();
	System.out.println(position1);
	List<WebElement> tableHeading=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
	System.out.println(tableHeading.size());
	for(int i=0;i<tableHeading.size();i++)
	{
		String text=tableHeading.get(i).getText();
		System.out.println(text);
	}
	WebElement edinBurgh=driver.findElement((By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]")));
	String edinBurghPrint=edinBurgh.getText();
	System.out.println(edinBurghPrint);
	WebElement tokyo=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[3]"));
	String tokyoPrint=tokyo.getText();
	System.out.println(tokyoPrint);
	List<WebElement> names=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	for(int i=0;i<names.size();i++)
	{
		String namesPrint=names.get(i).getText();
		System.out.println(namesPrint);
	}
	List<WebElement> positionColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
	for(int i=0;i<positionColumn.size();i++)
	{
		String positionColumnPrint=positionColumn.get(i).getText();
		System.out.println(positionColumnPrint);
	}
	List<WebElement> cedricKelly=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
	for(int i=0;i<cedricKelly.size();i++)
	{
		String cedricKellyPrint=cedricKelly.get(i).getText();
		System.out.println(cedricKellyPrint);
	}
	List<WebElement> airiSatuo=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td"));
	for(int i=0;i<airiSatuo.size();i++)
	{
		String airiSatuoPrint=airiSatuo.get(i).getText();
		System.out.println(airiSatuoPrint);
	}
	
	}

}
