import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssvalue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String colour1=link.getCssValue("colour");
		System.out.println("colour is:"+colour1);
		String fontsize1 = link.getCssValue("fontsize");
		System.out.println("fontsize is:"+fontsize1);
		String fm=link.getCssValue("font-family");
		System.out.println("font-family is:"+fm);
		driver.quit();
	}

}
