import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://m.cricbuzz.com/cricket-pointstable");
	Thread.sleep(2000);
			Set<String> allwin = driver.getWindowHandles();
			int count = allwin.size();
			System.out.println(count);
			for(String text:allwin) {
				System.out.println(text);
			}
          driver.quit();
	}

}
