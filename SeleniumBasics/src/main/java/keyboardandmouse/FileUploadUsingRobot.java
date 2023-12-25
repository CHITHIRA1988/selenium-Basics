package keyboardandmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chith\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
    String path="C:\\Users\\chith\\OneDrive\\Documents\\HelloWorld.docx";
    Actions action=new Actions(driver);
    Robot robot=new Robot();
    action.moveToElement(chooseFile).build().perform();
    action.click().build().perform();
    StringSelection ss = new StringSelection(path);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
