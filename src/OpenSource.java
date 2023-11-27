import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("sahoobiswajit158@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
	        Thread.sleep(10);
		driver.findElement(By.name("btn_login")).click();
		driver.manage().window().minimize();
		driver.close();
		
	}

}
