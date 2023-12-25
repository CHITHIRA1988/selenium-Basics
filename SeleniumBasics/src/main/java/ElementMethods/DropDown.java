package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		//String state="California";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/jquery-select.php");
	WebElement dropdown=driver.findElement(By.xpath("(//span[contains(text(),'Alaska')])[1]"));
	dropdown.click();
	WebElement input=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	input.sendKeys("Hawaii");
	//input.sendKeys(state);
	WebElement select=driver.findElement((By.xpath("//li[text()='Hawaii']")));
	select.click();
	//WebElement input1=driver.findElement(By.xpath("//li[text()='"+state+"']"));
	
	//input1.click();
	//System.out.println("//li[text()='"+state+"']");
	}

}

