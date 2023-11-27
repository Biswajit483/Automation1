package Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(priority = 2, invocationCount = 2)
   public void createCustomer() {
		Reporter.log("createcustomer",true);
	 
   }
	@Test (priority = 1,dependsOnMethods = "createCustomer") 
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test(priority = 3,dependsOnMethods = "modifyCustomer")
	public void deleteCustomer() {
		Reporter.log("Deletecustomer",true);
	}
	
}
