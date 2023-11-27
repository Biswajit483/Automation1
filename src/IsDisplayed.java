import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
       public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		   if(logo=true) {
			   System.out.println("facebook logo is displayed");
		   }else {
			   System.out.println("facebook logo is not  displayed");
		   }
		   driver.close();
	}
}
