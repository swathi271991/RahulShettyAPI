package Payloads;

import java.util.ArrayList;
import java.util.List;

import PoJos.AddPlacePoJo;
import PoJos.LocationPojo;

public class PlacePayloads {	
	
	public static AddPlacePoJo addPlacePayload(String name, String address, String language)
	{
		AddPlacePoJo pj = new AddPlacePoJo();
		
		LocationPojo lp = new LocationPojo();
		lp.setLat("-58.83262");
		lp.setLng("58.89998");
		
		pj.setLocation(lp);
		pj.setAccuracy(90);
		pj.setName(name);
		pj.setPhonenumber("+(91) 83065444766");
		pj.setAddress(address);
		
		List<String> values = new ArrayList<String>();
		values.add("new dress");
		values.add("old dress");
		
		pj.setTypes(values);
		pj.setWebsite("xty1.23@gmail.com");
		pj.setLanguage(language);
		
		return pj;
		
	}
	
	public static String deletePlacePayLoad(String place_id)
	{
		return "{\r\n" + 
				"    \"place_id\":\""+place_id+"\"\r\n" + 
				"}\r\n" ;
	}
	
}
