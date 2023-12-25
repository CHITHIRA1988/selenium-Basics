package ElementMethods;

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
		
		String idAttributeValue1=showMessage.getAttribute("class");
		System.out.println(idAttributeValue1);
		String idAttributeValue2=showMessage.getTagName();
		System.out.println(idAttributeValue2);
		driver.get("https://www.amazon.in/");
		WebElement allButton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String allButton1=allButton.getAttribute("Title");
		System.out.println(allButton1);
		String allButton2=allButton.getTagName();
		System.out.println(allButton2);
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement message=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String message1=message.getAttribute("Title");
		System.out.println(message1);
		WebElement google=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String google1=google.getAttribute("Title");
		System.out.println(google1);
		WebElement facebook=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-facebook']"));
		String facebook1=facebook.getAttribute("Title");
		System.out.println(facebook1);
		WebElement github=driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-github'])[1]"));
		String github1=github.getAttribute("Title");
		System.out.println(github1);
		String message2=message.getTagName();
		System.out.println(message2);
		String google2=google.getTagName();
		System.out.println(google2);
		int x=message.getLocation().x;
		int y=message.getLocation().y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		
	}

}
