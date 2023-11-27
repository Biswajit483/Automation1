package PopUps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Biswajit%20Sahoo/24%20july%202023/My%20World/document.html");
	File f=new File("D:\\Biswajit Sahoo\\24 july 2023\\My World\\Java Program");
	String abp = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abp);
	
	
	
	}

}
