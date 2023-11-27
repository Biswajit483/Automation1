import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int x1 = driver.findElement(By.id("email")).getLocation().getX();
		int x2 = driver.findElement(By.id("pass")).getLocation().getX();
		if(x1==x2) {
			System.out.println("text box properly allgned");
		}else {
			System.out.println("text box has not properly allgned");
		}
		driver.close();
	}

}
