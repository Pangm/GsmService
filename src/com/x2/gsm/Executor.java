package com.x2.gsm;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;

public class Executor implements Runnable {

	private AsyncContext actx = null;
	
	public Executor(AsyncContext actx) {
		this.actx = actx;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5 * 1000);
			ServletRequest request = actx.getRequest();
			List<String> books = new ArrayList<String>();
			books.add("bit bit...");
			books.add("ha ha...");
			request.setAttribute("books", books);
			actx.dispatch("/async.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
