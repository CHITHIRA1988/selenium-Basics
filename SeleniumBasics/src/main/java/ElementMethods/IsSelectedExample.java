package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	WebElement checkBox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
boolean isCheckBox=checkBox1.isSelected();
System.out.println(isCheckBox);
if(isCheckBox==false)
{
	System.out.println("checkbox is not clicked");
}
else
{
	System.out.println("checkBox is clicked");
}
if(isCheckBox==false)
{
	checkBox1.click();
}
boolean isCheckBox1=checkBox1.isSelected();
System.out.println(isCheckBox1);
	}

}
