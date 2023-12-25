package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.manage().window().maximize();
	WebElement likeUsOnFacebook=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']")) ;
    String likeUsOnFacebook1=likeUsOnFacebook.getAttribute("title");
    System.out.println(likeUsOnFacebook1);
    WebElement followAll=driver.findElement(By.xpath("//a[@id='windowMulti']"));
    String followAll1=followAll.getAttribute("title");
    System.out.println(followAll1);
	}

}
