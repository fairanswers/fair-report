package com.fairanswers.report;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONFormatter {
	public static String compact(Object obj){
		 Gson gson = new GsonBuilder().create();
		 String json = gson.toJson(obj);
	     return json;
	}

	public static String pretty(Object obj){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(obj);
		
	}
}
