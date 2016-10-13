package com.ibm.bo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.cloudant.client.api.Database;
import com.ibm.dbutil.APIDBUtil;
import com.ibm.model.User;

public class UserBo {
	List<JSONObject> presentationsView = null;
	Database db = APIDBUtil.connectToDatabase();
	

	public List<JSONObject> getAllUsers() {
		presentationsView = new ArrayList<JSONObject>();
		presentationsView = db.view("users/all").query(JSONObject.class);
		List<JSONObject> values = new ArrayList<JSONObject>();
		for (JSONObject jsonObject : presentationsView) {
			/*linea donde sucede la magia*/
			values.add((JSONObject) JSONValue.parse(JSONValue.toJSONString(jsonObject.get("value"))));			
		}
		return values;
	}

	
/*	public List<JSONObject> getUsrById(int id) {
		presentationsView = new ArrayList<JSONObject>();
		presentationsView = db.view("users/all").query(JSONObject.class);
		return null;
	}
*/
}
