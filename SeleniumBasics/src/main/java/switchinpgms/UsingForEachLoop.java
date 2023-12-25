package switchinpgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingForEachLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	WebElement clickHere=driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
	clickHere.click();
	//clickHere.click();
	//clickHere.click();
    String parentWindow=driver.getWindowHandle();
    System.out.println(parentWindow);
    Set<String> windows=driver.getWindowHandles();
    for(String id:windows)
    {
    	if(id.equals(parentWindow))
    	   {
    		System.out.println("no need to switch");
    	   }
    	else
    	{
    		driver.switchTo().window(id);
    	}
    }
    	String childTitlePrint=driver.getTitle();
        System.out.println(childTitlePrint);
        WebElement newWindow=driver.findElement((By.xpath("//h3[text()='New Window']")));
        
        String newWindow1=newWindow.getText();
        System.out.println(newWindow1);
        //driver.close();
        driver.switchTo().window(parentWindow);
    
	}

}
