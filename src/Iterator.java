import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwin = driver.getWindowHandles();
		java.util.Iterator<String> iti = allwin.iterator();
		String p1 = iti.next();
		String p2 = iti.next();
     Thread.sleep(2000);
     driver.switchTo().window(p2);
     driver.close();
     driver.switchTo().window(p1);
     driver.close();
	}

}
