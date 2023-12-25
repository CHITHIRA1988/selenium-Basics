package DifeerentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	String obsqura=driver.getTitle();
	System.out.println("obsqura="+obsqura);
	String url=driver.getCurrentUrl();
	System.out.println("obsqura url="+url);
	WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkBox.click();
	WebElement checkBoxOne=driver.findElement(By.xpath("//input[@class='check-box-list']"));
	checkBoxOne.click();
	WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
	checkBoxTwo.click();
	WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
	checkBoxThree.click();
	WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
	checkBoxFour.click();
	}

}
