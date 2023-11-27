package Pom;
import java.sql.Driver;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory


public class CheckboxPage {
	
	@FindBy(xpath="//input[starts-with(@type,'checkbox')]")
	private List<WebElement> boxes;
	public void CheckBoxPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void setCheckBoxClick() {
	for(int i =0;i<boxes.size();i++) {
	boxes.get(i).click();
	}
	}
	}

