import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		int X1 = driver.findElement(By.xpath("(//input[@type='radio'] )[1]")).getLocation().getX();
		int X2 = driver.findElement(By.xpath("(//input[@type='radio'] )[2]")).getLocation().getX();
		int X3 = driver.findElement(By.xpath("(//input[@type='radio'] )[3]")).getLocation().getX();
	   if(X1==X2 && X1==X3) {
		   System.out.println("alligned properly");
	   }else {
		   System.out.println(" not alligned properly");
	   }
	
	driver.quit();
	
	}

}
