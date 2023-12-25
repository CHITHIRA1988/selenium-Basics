package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	WebElement enterText=driver.findElement(By.xpath("//label[text()='Enter Message']"));
	String printText=enterText.getText();
	System.out.println(printText);
	WebElement enterTextInput=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    enterTextInput.sendKeys("Hello");
    WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
    String printMessage=showMessage.getText();
    System.out.println(printMessage);
    showMessage.click();
    WebElement enterYourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
    String printYourMessage=enterYourMessage.getText();
    System.out.println(printYourMessage);
    driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
    WebElement radioButton=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
    String radioButtonDemo=radioButton.getText();
    System.out.println(radioButtonDemo);
    WebElement showSelectedValue=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
    String showSelectedValueDemo=showSelectedValue.getText();
    System.out.println(showSelectedValueDemo);
	}

}
