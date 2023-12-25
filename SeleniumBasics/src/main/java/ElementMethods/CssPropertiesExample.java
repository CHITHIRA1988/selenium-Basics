package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPropertiesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.manage().window().maximize();
 WebElement likeUsOnFacebook=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
 String backGroundColor=likeUsOnFacebook.getCssValue("background-color");
 	System.out.println(backGroundColor);
 	String color=likeUsOnFacebook.getCssValue("color");
 	System.out.println(color);
 	String fontSize=likeUsOnFacebook.getCssValue("font-size");
 	System.out.println(fontSize);
 	String fontStyle=likeUsOnFacebook.getCssValue("font-style");
 	System.out.println(fontStyle);
 	WebElement followAll=driver.findElement(By.xpath("//a[@id='windowMulti']"));
 	 String backGroundColor1=followAll.getCssValue("background-color");
 	 	System.out.println(backGroundColor1);
 	 	String color1=followAll.getCssValue("color");
 	 	System.out.println(color1);
 	 	
 	 	String fontSize1=followAll.getCssValue("font-size");
 	 	System.out.println(fontSize1);
 	 	String fontStyle1=followAll.getCssValue("font-style");
 	 	System.out.println(fontStyle1);
	}

}
