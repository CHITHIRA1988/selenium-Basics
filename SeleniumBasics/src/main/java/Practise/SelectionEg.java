package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectionEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	driver.manage().window().maximize();
	WebElement checkBox1=driver.findElement((By.xpath("//form[@id='checkboxes']//input[1]")));
    boolean isCheckBox1=checkBox1.isSelected();
    System.out.println(isCheckBox1);
    WebElement checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
    boolean isCheckBox2=checkBox2.isSelected();
    System.out.println(isCheckBox2);
   if(isCheckBox1==false)
   {
	   checkBox1.click();
	   
   }
   if(isCheckBox2==false)
   {
	   checkBox2.click();
   }
   boolean ischeckBox3=checkBox1.isDisplayed();
   System.out.println(ischeckBox3);
   boolean ischeckBox4=checkBox2.isDisplayed();
   System.out.println(ischeckBox4);
   boolean isCheckBox5=checkBox1.isEnabled();
   System.out.println(isCheckBox5);
   boolean isCheckBox6=checkBox2.isEnabled();
   System.out.println(isCheckBox6);
   
    		}

}
