package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	
	String buttonText=showMessage.getText();
	System.out.print(buttonText);
	
    WebElement yourMessage=driver.findElement(By.xpath("//div[@class='my-2']"));
	
	String Message=yourMessage.getText();
	System.out.println(Message);
	
	WebElement inputField=driver.findElement(By.xpath("//input[@class='form-control']"));
	inputField.sendKeys("welcome");
	showMessage.click();
	String newMessage=yourMessage.getText();
	System.out.println(newMessage);
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement radioButton=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
	String radioButtonDemo=radioButton.getText();
	System.out.println(radioButtonDemo);
	WebElement showSelectedValue=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
	String showSelectedValueDemo=showSelectedValue.getText();
	System.out.println("output="+showSelectedValueDemo);
	
		
	}

}