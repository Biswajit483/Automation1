import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	  public static void main(String[] args) throws IOException, AWTException {
			WebDriver driver=new ChromeDriver();
			Runtime.getRuntime().exec("notepad");
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_Q);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_P);

	}
}
