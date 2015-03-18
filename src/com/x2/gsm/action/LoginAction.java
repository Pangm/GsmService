package com.x2.gsm.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8733296820747604712L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		if (getUsername().equals("Joe")
				&& getPassword().equals("x2")) {
			ctx.getSession().put("user", getUsername());
			ctx.put("tip", getText("succTip", new String[] {getUsername()}));
			return SUCCESS;
		} else {
			ctx.put("tip", getText("failTip", new String[] {getUsername()}));
			return ERROR;
		}
	}
	

}
