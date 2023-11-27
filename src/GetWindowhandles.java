import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwin = driver.getWindowHandles();
		int count = allwin.size();
		System.out.println(count);
		for(String title:allwin) {
			driver.switchTo().window(title);
			System.out.println(driver.getTitle());
		}
		for(String alltab:allwin) {
			driver.switchTo().window(alltab);
			driver.close();
		}
		//driver.close();
		//driver.quit();
	}

}
