package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.UserPeer;

public class DBConnect {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String jdbcurl = "jdbc:mysql://localhost:3306/coursetable";
	private static String dbUserName = "root";
	private static String dbPassword = "";

	public DBConnect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.sql.Connection getConnection() {
		java.sql.Connection conn = null;

		try {

			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		try {

			conn = (java.sql.Connection) DriverManager.getConnection(jdbcurl,
					dbUserName, dbPassword);

		} catch (Exception e) {
			System.out.println("Connection Error" + e.getMessage());
			return null;
		}
		System.out.println("MySQL Connect Success");
		return conn;

	}

	public void putConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
