package Framework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Assertion {
@Test
public void varifyAssertion() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String ExpectedResult = "Doogle";
	String ActualResult = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(ExpectedResult,ActualResult);
	
	driver.close();

	//s.assertAll();
}
}
