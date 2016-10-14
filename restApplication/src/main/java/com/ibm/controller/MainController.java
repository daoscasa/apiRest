package com.ibm.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.bo.PropertyBo;
import com.ibm.bo.UserBo;
import com.ibm.model.User;



@RestController
public class MainController {
	UserBo usrBO;
	PropertyBo propertyBO = null;
	User usr = null;
	
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public String getTest(){
		propertyBO = new PropertyBo();
		return propertyBO.test();
	}
	
	@RequestMapping(value = "/users/", method = RequestMethod.GET)
	public List<JSONObject> getAllUsers(){
		usrBO = new UserBo();
		List<JSONObject> listaUsr = usrBO.getAllUsers();
		return listaUsr;
	}
	@RequestMapping(value ="/users/{id}",method = RequestMethod.GET)
	public JSONObject getUserByid(@PathVariable String id){
		usrBO = new UserBo();	
		JSONObject usr = usrBO.getUsrById(id);
		return usr;
		
	}
	@RequestMapping(value = "/users/{id}",method=RequestMethod.POST)
	public User guardarUsr(@RequestBody User usr,@PathVariable String id){
		Integer idUser = Integer.valueOf(id);
		usrBO = new UserBo();
		usr.setId(idUser);
		usr = usrBO.saveUsrById(usr);
		return usr;
	}	
	
}
