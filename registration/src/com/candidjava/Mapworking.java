package com.candidjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapworking {

	
	
	public void MapWorking()
	{
		
		
	}
	
	
	public Map<String,Set<String>> getdropdown()
	{
		
		Map<String,Set<String>> mydrop = new HashMap<String,Set<String>>();
		Set<String> valuesdrop = new HashSet<String>();
		Set<String> values = new HashSet<String>();
		valuesdrop.add("INFRA");
		valuesdrop.add("BATCH");
		
		mydrop.put("Consumer_center", valuesdrop);
		mydrop.put("RM", values);
		
		
		
		return mydrop;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mapworking mapwk = new Mapworking();
       
   
	}

}
