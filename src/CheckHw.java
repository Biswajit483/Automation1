import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHw {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement email = driver.findElement(By.id("email"));
	int H1 = email.getSize().getHeight();
	int W1 = email.getSize().getWidth();
	WebElement password = driver.findElement(By.id("pass"));
	int H2 =  password.getSize().getHeight();
	int W2 =  password.getSize().getWidth();
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	String s = login.getText();
	 String s1 = login.getAttribute("login");
	String s2 = login.getTagName();
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	
	
	if(H1==H2) {
		System.out.println("BOTH HEIGHT SAME");
	}else if(W1==W2) {
		System.out.println("BOTH WEIGHT SAME");
	}else {
		System.out.println("BOTH not  SAME");
	}
	driver.close();
	}

}
