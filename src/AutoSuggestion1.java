import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("iphone 14 plus");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		 List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 int count = autosuggestion.size();
		 System.out.println(count);
		 for (WebElement sugg : autosuggestion) {
			 
			 System.out.println(sugg.getText());
		}
		 //autosuggestion.get(0).click();
		 driver.close();
	}

}
