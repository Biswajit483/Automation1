package PopUps;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	    driver.findElement(By.id("policynumber")).sendKeys("123");
	    driver.findElement(By.id("dob")).click();
	    WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	   Select s=new Select(month);
	   s.selectByValue("9");
	  WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	   Select s1=new Select(year);
	   s1.selectByValue("1985");
	 driver.findElement(By.xpath("//a[.='15']")).click();
	   
	  driver.findElement(By.id("alternative_number")).sendKeys("9854798547"+Keys.ENTER);
	driver.findElement(By.id("renew_policy_submit")).submit();
	  
	  
	  //driver.close();
	}

}
