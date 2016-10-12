package com.ibm.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.Database;
import com.ibm.dbutil.APIDBUtil;


@RestController
public class MainController {
	Database db = APIDBUtil.connectToDatabase();
	
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public String getTest(){
		List<JSONObject> PresentationsView = new ArrayList<JSONObject>();
		PresentationsView = db.view("PresentationMeta/all").query(JSONObject.class);
		
		if(PresentationsView.isEmpty())
			return new String("Esto no anda");
		else
			return new String("Trajo datos");
	}

}
