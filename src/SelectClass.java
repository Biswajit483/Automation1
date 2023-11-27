import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
	 WebElement daylist = driver.findElement(By.name("birthday_day"));
           Select s=new Select( daylist);
           s.selectByIndex(9);
           WebElement monthlist = driver.findElement(By.name("birthday_month"));
           Select s1=new Select(monthlist);
           s1.selectByValue("7");
           WebElement yearlist = driver.findElement(By.name("birthday_year"));
           Select s2=new Select(yearlist);
           s2.selectByVisibleText("1999");
		
		//driver.quit();
	}

}
