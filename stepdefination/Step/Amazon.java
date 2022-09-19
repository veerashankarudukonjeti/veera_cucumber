package Step;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	@Given("open chrome browser and amazon website")
	public void open_chrome_browser_and_amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("Enter emailid {string}")
	public void enter_emailid(String emailId) {
	    
		System.out.println(emailId);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	   
		System.out.println(password);
	}

	@Then("select the product for purchase")
	public void select_the_product_for_purchase() {
	    
	}

	@Then("Check for validation")
	public void check_for_validation() {
	    
		System.out.println("validated");
	}
	@When("Enter emailid and password")
	public void enter_emailid_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
		for(Map<String,String> testdata : dataTable.asMaps()) {
			System.out.println("emailid: " +testdata.get("emailId"));	
			System.out.println("password: " +testdata.get("password"));	
			
		}
	    throw new io.cucumber.java.PendingException();
	}


}