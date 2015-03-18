package com.x2.gsm.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class QueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4532274880770787718L;	
	private Map<String, String> map = new HashMap<String, String>();
	private int status = 0;
	private String ak = "";
	
	public String execute() {
		if (ak.equals("421081564")) {
			map.put("name", "Joe");
			status = 0;
			return Action.SUCCESS;
		} else
		{
			status = -1;
			return Action.SUCCESS;	
		}
	}
	
	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	//	@JSON(name="newName")
	public Map getMap() {
		return this.map;
	}

	public int getStatus() {
		return status;
	}
}
