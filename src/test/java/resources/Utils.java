package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {


	public static RequestSpecification req;
	public static ResponseSpecification resp;

	public RequestSpecification requestSpec() throws FileNotFoundException
	{
		if(req==null)
		{
			PrintStream ps = new PrintStream(new FileOutputStream("logging.txt"));
			req = new RequestSpecBuilder().setContentType(ContentType.JSON)
					.setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(ps))
					.addFilter(ResponseLoggingFilter.logResponseTo(ps)).build();
		return req;
		}
		return req;
	}

	public ResponseSpecification responseSpec()
	{
		resp = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).
				build();
		
		return resp;
	}
	
	
	public String getJsonPath(Response response , String key)
	{
		JsonPath js = new JsonPath(response.asString());
		String keyvalue = js.get(key);
		
		return keyvalue;
	}

}
