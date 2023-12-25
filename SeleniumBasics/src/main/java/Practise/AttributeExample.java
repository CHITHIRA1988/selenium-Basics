package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	String idAttributeValue=showMessage.getAttribute("id");
	System.out.println(idAttributeValue);
	String classAttributeValue=showMessage.getAttribute("class");
	System.out.println(classAttributeValue);
	driver.get("https://www.amazon.in/");
	WebElement allButton=driver.findElement((By.xpath("//select[@id='searchDropdownBox']")));
    String allButton1=allButton.getAttribute("id");
    System.out.println(allButton1);
    driver.get("https://demo.guru99.com/test/social-icon.html");
    WebElement message=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
    String message1=message.getAttribute("title");
    System.out.println(message1);
    String message2=message.getTagName();
    System.out.println(message2);
    int x=message.getLocation().x;
    int y=message.getLocation().y;
    System.out.println("x="+x);
    System.out.println("y="+y);
    
    
	}

}
