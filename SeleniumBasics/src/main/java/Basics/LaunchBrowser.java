package Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class LaunchBrowser {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\EdgeDriver\\msedgedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String amazontitle=driver.getTitle();		
	System.out.println("amazontitle ="+amazontitle);
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	driver.get("https://selenium.obsqurazone.com/index.php");
	String obsqura=driver.getTitle();
	System.out.println("obsqura="+obsqura);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.quit();
	//driver.close();
	}

}
