import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		// driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		WebElement link = driver.findElement(By.partialLinkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		a.contextClick(link).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		//r.keyPress(KeyEvent.VK_W);
	}

}
