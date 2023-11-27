import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[contains(.,'Java ')]"));
		int count = autosuggestion.size();
		System.out.println(count);
		
		//for(WebElement sub:autosuggestion) {
			//String alltext = sub.getText();
			//System.out.println(alltext);
		//}
		
		for(int i=1;i<count;i++) {
			WebElement printtext=autosuggestion.get(i);
			printtext.getText();
			System.out.println(printtext);
		}
		autosuggestion.get(1).click();
		driver.quit();
	}

}
