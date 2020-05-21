package com.skills.skillsservices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {

	/*@Value("#{${props.map}}")
	public Map<String, String> myJson = new HashMap<>();*/
	
	@Value("#{${map.queryString}}")
	public Map<String, String> queryStringMap = new HashMap<>();
	
	@Value("${query.limit}")
	private String queryLimit;
	
	public void printData()
	{
		/*JSONObject json = new JSONObject(myJson);
		System.out.println(json.toString());*/	
		
		/*String queryString =queryStringMap.get("prefix") + System.lineSeparator() +
				queryStringMap.get("input") + System.lineSeparator() +
				queryStringMap.get("select") + System.lineSeparator() +
				"WHERE  { \n" +
				"VALUES ? "+ queryStringMap.get("status") + System.lineSeparator() +
				queryStringMap.get("r1") + System.lineSeparator() +
				queryStringMap.get("r2") + System.lineSeparator() +
				queryStringMap.get("r3") + System.lineSeparator() +
				queryStringMap.get("r4") + System.lineSeparator() +
				queryStringMap.get("r5") + System.lineSeparator() +
				queryStringMap.get("r6") + System.lineSeparator() +
				queryStringMap.get("r7") + System.lineSeparator() +
				queryStringMap.get("r8") + System.lineSeparator() +
				queryStringMap.get("r9") +  System.lineSeparator() +
				"} \n" +
				queryStringMap.get("limit") + ";";*/

		String queryString = queryStringMap.get("prefixClause") + System.lineSeparator() +
							 queryStringMap.get("inputClause") + System.lineSeparator() +
							 queryStringMap.get("selectClause") + System.lineSeparator() +
							 queryStringMap.get("whereClause") + System.lineSeparator() +
							 queryLimit + ";";
		
		System.out.println(queryString);
	}
}
