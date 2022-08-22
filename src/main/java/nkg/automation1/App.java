package nkg.automation1;

import java.sql.Statement;

import net.ucanaccess.jdbc.UcanaccessDriver;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	static Connection conn = null;
	static Statement stmt = null;
	public static void main(String[] args) {
		GetConnection();
	}

	static void GetConnection() {
		try {
			System.out.println("This is test");
//			Class<?> x =  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\Personal\\Project\\wip\\automation\\Test_Scenario.xls");
			stmt = conn.createStatement();
		}

		catch (Exception e) {
			System.err.println(e);
		}
	}
}
