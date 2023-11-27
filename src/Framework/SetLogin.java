package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetLogin{
  @Test
  public void testvalidLogin() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  LoginPage l=new LoginPage(driver);
	  l.setLogin("admin","manager");
  }
}
