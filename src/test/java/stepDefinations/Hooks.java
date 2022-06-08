package stepDefinations;

import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@DeletePlace")
	public void beforeScenario() throws Throwable 
	{
		stepDefination1 sp = new stepDefination1();
		if(stepDefination1.place_id == null)
		{
		sp.add_place_payload_using_and("hybby", "xyzhj", "rtyuio");
		sp.user_calls_something_using_something_http_request("AddPlaceAPI", "POST");
		sp.verify_placeid_generated_by_calling_something_using_something_http_request("GetPlaceAPI", "GET");	
		}
		
	}

}
