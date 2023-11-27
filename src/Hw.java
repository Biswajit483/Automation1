import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
      public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		int height = driver.findElement(By.name("login")).getSize().getHeight();
		int width=driver.findElement(By.name("login")).getSize().getWidth();
		System.out.println("height is:"+height);
		System.out.println("width is:"+width);
		driver.manage().window().minimize();
		driver.quit();
	}
}
