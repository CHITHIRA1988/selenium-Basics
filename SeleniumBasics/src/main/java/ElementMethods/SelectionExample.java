package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectionExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	driver.manage().window().maximize();
	WebElement checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
WebElement checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
boolean ischeckBox1=checkBox1.isSelected();
boolean ischeckBox2=checkBox2.isSelected();
System.out.print(ischeckBox1);
System.out.println(ischeckBox2);
if(ischeckBox1==false)
{
checkBox1.click();
}
if(ischeckBox2==false)
{
checkBox2.click();
}
boolean ischeckBox3=checkBox1.isDisplayed();
boolean ischeckBox4=checkBox2.isDisplayed();
System.out.print(ischeckBox3);
System.out.print(ischeckBox4);
boolean ischeckBox5=checkBox1.isEnabled();
boolean ischeckBox6=checkBox2.isEnabled();
System.out.print(ischeckBox5);
System.out.print(ischeckBox6);




}
}
