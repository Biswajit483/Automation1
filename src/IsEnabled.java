import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean loginfb = driver.findElement(By.name("login")).isEnabled();
		System.out.println(loginfb);
		driver.quit();
	}

}
