import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
       public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement link1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement link2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		a.dragAndDrop(link1, link2).perform();
		
		
	}
}
