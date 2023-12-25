package DifeerentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikeUsOnFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
    driver.manage().window().maximize();
    WebElement likeFacebook=driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
    likeFacebook.click();

	}

}
