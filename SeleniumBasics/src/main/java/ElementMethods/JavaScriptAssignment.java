package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickMe1=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		WebElement clickMe2=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		WebElement clickForPromptBox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		clickMe1.click();
		String clickMe=driver.switchTo().alert().getText();
		System.out.println(clickMe);
		driver.switchTo().alert().accept();
		clickMe2.click();
		driver.switchTo().alert().dismiss();
		clickForPromptBox.click();
		driver.switchTo().alert().sendKeys("WELCOME");
		driver.switchTo().alert().accept();

	}

}
