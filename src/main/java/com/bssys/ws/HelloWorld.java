package com.bssys.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	@WebMethod
	public String sayHi(String text);

}
