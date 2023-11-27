package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.util.filetypedetector.FileType;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
@Test
public void takeScreenshot() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://stage.rehlat.com/en/e-visa");
	TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ss.png");
		FileUtils.copyFile(src, dest);
		
		driver.close();


}
}
