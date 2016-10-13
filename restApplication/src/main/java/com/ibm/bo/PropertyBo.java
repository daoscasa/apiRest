package com.ibm.bo;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.cloudant.client.api.Database;
import com.ibm.dbutil.APIDBUtil;

public class PropertyBo {
	Database db = APIDBUtil.connectToDatabase();
	
	public String test(){
		List<JSONObject> PresentationsView = new ArrayList<JSONObject>();
		PresentationsView = db.view("users/all").query(JSONObject.class);
		if(PresentationsView.isEmpty())
			return new String("Esto no anda");
		else
			return new String("Trajo datos");
	}

}
