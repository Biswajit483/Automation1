import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandllingMousehover {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Actions a=new Actions(driver);
		 WebElement Resources = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(Resources).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String text = driver.findElement(By.xpath("(//div[@class='text-reset text-decoration-none'])[2]")).getText();
	      System.out.println(text);
     
     driver.quit();
     
     }
}
