package coremethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuteEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    JavascriptExecutor js=(JavascriptExecutor) driver;
    //js.executeScript("alert('chithira');");
    //js.executeScript("window.scrollBy(0,200)");
    //Thread.sleep(2000);
    //js.executeScript("window.scrollBy(0,2000)");
    WebElement facebook=driver.findElement((By.xpath("//a[text()='Facebook']")));
    js.executeScript("arguments[0].scrollIntoView();",facebook);
   //js.executeScript("arguments[0].click();",facebook);
    WebElement searchField=driver.findElement((By.xpath("//input[@id='twotabsearchtextbox']")));
    searchField.sendKeys("chithira");
    js.executeScript("arguments[0].click();",searchField);
    
    }
	}
