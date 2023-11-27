import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Biswajit Sahoo\\24 july 2023\\My World\\Iframe");
		driver.findElement(By.xpath("//td[@data-value='page1.html']")).click();
driver.switchTo().frame(0);
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bisu");
 driver.switchTo().parentFrame();
 driver.findElement(By.id("f1")).sendKeys("rehlat");
	}

}
