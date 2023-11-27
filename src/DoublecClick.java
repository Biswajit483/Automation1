import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoublecClick {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.vtiger.com/");
	driver.manage().window().maximize();
	WebElement pg = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(pg).perform();
	driver.findElement(By.partialLinkText("Customers")).click();
	WebElement rd = driver.findElement(By.partialLinkText("READ THE CASE"));
	a.doubleClick(rd).perform();
	
	//driver.findElement(By.xpath("//div[@class='cc-compliance my-2 mx-3']")).click();
     String s1 = driver.getTitle();
     String s2="HackerEarth Case Study | Vtiger CRM";
     if(s1.equals(s2)) {
    	 System.out.println("you are on the right page");
     }else {
    	 System.out.println("you are not on the right page");
     }
     driver.quit();
	}

}
