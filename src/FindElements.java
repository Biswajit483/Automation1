import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> alllink = driver.findElements(By.tagName("div"));
		 int count = alllink.size();
		 System.out.println(count);
		 for(int i=1;i<count;i++) {
			WebElement text1 = alllink.get(i);
			String printtext = text1 .getText();
		   System.out.println(printtext);
		 }
        driver.quit();
	}

}
