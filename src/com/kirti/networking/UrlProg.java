package com.kirti.networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlProg {
	public static void main(String[] args) throws Exception {
		URL theURL = new URL("http://www.google.com");
		System.out.println("basic Informaiton");
		System.out.println();
		System.out.println("Protocol : " + theURL.getProtocol());
		System.out.println("Port : " + theURL.getPort());
		System.out.println("Host : " + theURL.getHost());
		
		URLConnection theconn = theURL.openConnection();
		int contentLen = theconn.getContentLength();
		int c;
		
		if (contentLen != 0) {
			System.out.println("The Content : ");
			System.out.println();
			InputStream URLInput = theconn.getInputStream();
			while (( c = URLInput.read()) != -1) {
				System.out.print((char)c);
			}
			URLInput.close();
		}
		else {
			System.out.println("Sorry no Content");
		}
	}
}
