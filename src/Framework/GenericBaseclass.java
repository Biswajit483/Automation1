package Framework;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.IOExceptionList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GenericBaseclass {
	public static WebDriver driver;
@BeforeClass
public void openbrowser() {
	Reporter.log(" openbrowser",true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
}
@AfterClass
public void closebrowser() {
	Reporter.log("closebrowser",true);
	driver.close();
}
@BeforeMethod
public void login()throws IOException {
	Reporter.log("login",true);
	driver.get("https://demo.actitime.com/login.do");
	 FileLib f=new FileLib();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(f.getPropertyData("username"));
	 driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(f.getPropertyData("password"));
		driver.findElement(By.id("loginButton")).click();
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}
