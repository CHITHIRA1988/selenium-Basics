package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PrintCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	WebElement clickOnThisCheckBox=driver.findElement((By.xpath("(//label[@class='form-check-label'])[1]")));
	String clickOnThisCheckBox1=clickOnThisCheckBox.getText();
	System.out.println(clickOnThisCheckBox1);
	WebElement checkBox1=driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]"));
    String printName1=checkBox1.getText();
    System.out.println(printName1);
    WebElement checkBox2=driver.findElement(By.xpath("(//label[@class='form-check-label'])[3]"));
    String printName2=checkBox2.getText();
    System.out.println(printName2);
    WebElement checkBox3=driver.findElement(By.xpath("(//label[@class='form-check-label'])[4]"));
    String printName3=checkBox3.getText();
    System.out.println(printName3);
    WebElement checkBox4=driver.findElement(By.xpath("(//label[@class='form-check-label'])[5]"));
    String printName4=checkBox4.getText();
    System.out.println(printName4);
	}

}
