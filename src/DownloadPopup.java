import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPopup {

	public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.xpath("//p[.='Java']/../p[2]/a")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.close();
	}

}
