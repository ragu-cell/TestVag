package com.test;

import java.io.File;
import java.util.*;

import io.restassured.path.json.JsonPath;

public class TestAssesment {
	public static void main(String[] args) {
 System.out.println(System.getProperty("user.dir"));
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\rcb.json");
		
	int countryCounter = 0;
		
		JsonPath jsonPath = new JsonPath(file);
		int length = jsonPath.getInt("player.size");
		for (int i = 0; i < length; i++) {
				String country = jsonPath.getString("player["+i+"].country");
				if(!(country.equals("India"))) {
				countryCounter++;	
				}
		}
		if(countryCounter>3) {
			System.out.println("fail");
		}else {
			System.out.println("pass");
		}

	}
}
