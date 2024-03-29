package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWorld {

	@WebMethod
	public String sayHello(String str){
	    System.out.println("get Message...");
	    String result = "Hello World, "+str;
	    return result;
	}
	
	public static void main(String[] args) {
	    System.out.println("server is running");
	    String address="http://localhost:9000/HelloWorld";
	    Object implementor =new HelloWorld();
	    Endpoint.publish(address, implementor);
	 }
	
}
