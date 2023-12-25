package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
    driver.manage().window().maximize();
    Actions action=new Actions(driver);
    WebElement dragDownSource=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    WebElement dragDownDestination=driver.findElement(By.xpath("//ol[@id='amt7']"));
    action.dragAndDrop(dragDownSource,dragDownDestination).build().perform();
	}

}
