package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.DBConnect;

import com.sk.beans.User;

public class UserPeer {

	public static boolean checkLogin(String Uname, String Upassword) {
		DBConnect dbConnect = new DBConnect();
		Connection connection = dbConnect.getConnection();
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM myUSER WHERE Uname='" + Uname
						+ "' AND Upassword='" + Upassword + "'  ";
				ResultSet rs = statement.executeQuery(query);
				while (rs.next()) {
					return true;
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return false;
	}

	public static boolean checkUserExist(String Uname) {
		DBConnect dbConnect = new DBConnect();
		Connection connection = dbConnect.getConnection();
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM myUSER WHERE Uname='" + Uname
						+ "'";
				ResultSet rs = statement.executeQuery(query);
				while (rs.next()) {
					return true;
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return false;
	}

	public static String registerUser(String username, String password) {
		if (checkUserExist(username)) {
			return "existed";
		}
		DBConnect dbConnect = new DBConnect();
		String rtn = "true";
		Connection connection = dbConnect.getConnection();
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "INSERT INTO MYUSER VALUES('" + username + "','"
						+ password + "','')";
				String query1 = "INSERT INTO `coursetable`.`myuser` (`uId`, `uName`, `uPassword`, `uKey`) VALUES (NULL, '"
						+ username + "', '" + password + "', '');";
				System.out.println(query);
				statement.executeUpdate(query1);

			} catch (SQLException e) {
				rtn = "false";
				e.printStackTrace();
			}
		}

		return rtn;
	}

	public static void main(String arg[]) {
		System.out.println(registerUser("dddddsdkk", "ss"));

	}
}
