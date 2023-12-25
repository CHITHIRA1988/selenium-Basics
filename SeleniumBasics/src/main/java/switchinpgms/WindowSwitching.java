package switchinpgms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

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
    int size=windows.size();
    System.out.println(size);
    String s=driver.getTitle();
    System.out.println(s);
    Iterator<String> iterate=windows.iterator();
    while(iterate.hasNext())
    {
    	String id=iterate.next();
   	if(!(id.equals(parentWindow)))
   {
   		//String Childwindow = driver.getWindowHandle();
		//System.out.println(Childwindow);//to get the childWindow id
    	 driver.switchTo().window(id);
    	 }
    	   
   }
    //String childwindow = driver.getWindowHandle();
	//System.out.println(Childwindow);//to get the childWindow id
    String childTitlePrint=driver.getTitle();
    System.out.println(childTitlePrint);
    WebElement newWindow=driver.findElement((By.xpath("//h3[text()='New Window']")));
    
    String newWindow1=newWindow.getText();
    System.out.println(newWindow1);
    //driver.close();
    driver.switchTo().window(parentWindow);
    String clickHereText=clickHere.getText();
    System.out.println(clickHereText);
    

}
}
