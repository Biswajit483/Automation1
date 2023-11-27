import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
       public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("Window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j.executeScript("Window.scrollTo(0,0)");
	}
}
