package com.skills.skillsservices;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {

	@Value("#{${props.map}}")
	public Map<String, String> myJson = new HashMap<>();
	
	public void printData()
	{
		JSONObject json = new JSONObject(myJson);
		System.out.println(json.toString());	
	}
}
