import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElement {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Biswajit%20Sahoo/24%20july%202023/My%20World/Iframe/StaticWebpage.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	r.executeScript("document.getElementById('d2').value='manager'");
	
	
	
	
	
	
	}

}
