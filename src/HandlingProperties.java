import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingProperties {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	 
FileInputStream fis=new FileInputStream("./Data/Handlling.Property.txt");
	
       Properties p=new Properties();
             p.load(fis);
       String url = p.getProperty("username");
       driver.findElement(By.id("username")).sendKeys(url);
       String pwd1 = p.getProperty("password");
       driver.findElement(By.name("pwd")).sendKeys(pwd1);
       driver.findElement(By.id("loginButton")).click();
       System.out.println(url);
       System.out.println(pwd1);
 driver.close();

	}

}
