package com.testConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		try {
			
			Connection connection = DriverManager.getConnection(TDataBaseCst.URL, TDataBaseCst.USER, TDataBaseCst.PASSWORD);
			
			System.out.println("connete");
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
