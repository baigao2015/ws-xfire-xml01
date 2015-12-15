package com.multipless.egogoal.ws.client;

import java.net.URL;

import org.apache.xerces.dom.DocumentImpl;
import org.codehaus.xfire.client.Client;


public class XfireClientTest {

	public static void main(String[] args) throws Exception {
//		String serviceUrl = "http://localhost:8080/ws/service/BookService";
		String serviceUrl = "http://localhost:8080/ws-xfire-xml01/ws/service/BookService?wsdl";
		Client client = new Client(new URL(serviceUrl));
		Object[] results = client.invoke("sayHello", new Object[]{"multipels"});
		Object[] results2 = client.invoke("getBookById", new Object[]{3});
		System.out.println(results[0]);
		System.out.println(results2[0]);
	}

}