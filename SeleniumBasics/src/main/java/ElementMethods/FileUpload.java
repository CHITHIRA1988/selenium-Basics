package ElementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
    String filePath="C:\\Users\\chith\\OneDrive\\Documents\\HelloWorld.docx";
    //chooseFile.sendKeys(filePath);//fileupload using sendkeys
    File file=new File(filePath);
    chooseFile.sendKeys(file.getAbsolutePath());
    }

}
