package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessagePrinting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/form-submit.php");
	WebElement submitButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	submitButton.click();
	List<WebElement> errorMessages=driver.findElements(By.xpath("//div[@class='col-md-4 mb-3']//div[@class='invalid-feedback']"));
	//System.out.println(errorMessages.size());
	for(int i=0;i<errorMessages.size();i++)
    {
    	String s1=errorMessages.get(i).getText();
    	System.out.println(s1);
    	//String s2=errorMessages.get(i).getAttribute("class");
    	//System.out.println(s2);
    }
    WebElement errorMessage1=driver.findElement(By.xpath("//div[@class='form-row']//div[@class='col-md-6 mb-3']//div[1]"));
    String s3=errorMessage1.getText();
    System.out.println(s3);
    
    List<WebElement> errorMessage=driver.findElements(By.xpath("//div[@class='form-row']//div[@class='col-md-3 mb-3']//div[1]"));
    //System.out.println(errorMessage.size());
    for(int i=0;i<errorMessage.size();i++)
    {
    	String s2=errorMessage.get(i).getText();
    	System.out.println(s2);	
    }
    WebElement errorMessage2=driver.findElement(By.xpath("//div[@class='form-group']//div[@class='form-check']//div"));
    String s4=errorMessage2.getText();
    System.out.println(s4);
	}

}
