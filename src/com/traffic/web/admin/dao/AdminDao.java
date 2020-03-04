package com.traffic.web.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.traffic.web.admin.beans.Document;
import com.traffic.web.admin.beans.Punishment;
import com.traffic.web.admin.beans.User;

public class AdminDao {

	private void close(Connection connection, Statement statement, ResultSet resultSet) {
		// TODO Auto-generated method stub

		try {
			if (connection != null)
				connection.close();
			if (statement != null)
				statement.close();
			if (resultSet != null)
				resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<User> getPendingRequest() throws SQLException {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from users where request=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "pending");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String userName = resultSet.getString("userName");
				String password = resultSet.getString("password");
				String contact = resultSet.getString("contact");
				String nid = resultSet.getString("nid");
				String address = resultSet.getString("address");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				String vehicle = resultSet.getString("vehicle");
				String request = resultSet.getString("request");
				User user = new User(id, userName, password, contact, nid, address, drivingLicense, vehicleLicense,
						vehicle, request);
				list.add(user);
			}
			return list;
		}

		finally {
			close(connection, preparedStatement, resultSet);
		}
	}

	public List<User> getApprovedRequest() throws SQLException {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from users where request=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "success");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String userName = resultSet.getString("userName");
				String password = resultSet.getString("password");
				String contact = resultSet.getString("contact");
				String nid = resultSet.getString("nid");
				String address = resultSet.getString("address");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				String vehicle = resultSet.getString("vehicle");
				String request = resultSet.getString("request");
				User user = new User(id, userName, password, contact, nid, address, drivingLicense, vehicleLicense,
						vehicle, request);
				list.add(user);
			}
			return list;
		}

		finally {
			close(connection, preparedStatement, resultSet);
		}
	}

	public List<User> getPunishedUser() throws SQLException {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from users where policeNotice!=? and request=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "No Notice");
			preparedStatement.setString(2, "success");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String userName=resultSet.getString("userName");
				String contact = resultSet.getString("contact");
				String nid = resultSet.getString("nid");
				String address = resultSet.getString("address");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				String vehicle = resultSet.getString("vehicle");
				User user = new User(id,userName, contact, nid, address, drivingLicense, vehicleLicense, vehicle);
				list.add(user);
			}
			return list;
		}

		finally {
			close(connection, preparedStatement, resultSet);
		}
	}

	public List<User> getUserReport() throws SQLException {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from users where userNotice!=? and request=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "No Notice");
			preparedStatement.setString(2, "success");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String contact = resultSet.getString("contact");
				String nid = resultSet.getString("nid");
				String address = resultSet.getString("address");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				String vehicle = resultSet.getString("vehicle");
				String userNotice = resultSet.getString("userNotice");
				User user = new User(id, contact, nid, address, drivingLicense, vehicleLicense, vehicle, userNotice);
				list.add(user);
			}
			return list;
		}

		finally {
			close(connection, preparedStatement, resultSet);
		}
	}

	public void acceptRequest(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement preparedStatement = null;

		try {
			// get db connection
			myConn = DB.getCon();

			// create SQL update statement
			String sql = "update users " + "set userNotice=?,policeNotice=?,request=? where id=?";

			// prepare statement
			preparedStatement = myConn.prepareStatement(sql);

			// set params
			preparedStatement.setString(1, "No Notice");
			preparedStatement.setString(2, "No Notice");
			preparedStatement.setString(3, "success");
			preparedStatement.setInt(4, id);

			// execute SQL statement
			preparedStatement.execute();
		} finally {
			// clean up JDBC objects
			close(myConn, preparedStatement, null);
		}
	}

	public void rejectRequest(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// get db connection
			connection = DB.getCon();
			String query = "delete from users where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} finally {
			close(connection, preparedStatement, null);
		}
	}

	public List<Punishment> getInvoiceList(int userId) throws SQLException {
		// TODO Auto-generated method stub
		List<Punishment> list = new ArrayList<Punishment>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from punishment where userId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String policeNotice = resultSet.getString("policeNotice");
				String reasonOne = resultSet.getString("reasonOne");
				String reasonTwo = resultSet.getString("reasonTwo");
				String reasonThree = resultSet.getString("reasonThree");
				String reasonFour = resultSet.getString("reasonFour");
				String reasonFive = resultSet.getString("reasonFive");
				String reasonSix = resultSet.getString("reasonSix");
				String fine = resultSet.getString("fine");
				String punish = resultSet.getString("punish");
				Punishment punishment = new Punishment(id, policeNotice, reasonOne, reasonTwo, reasonThree, reasonFour,
						reasonFive, reasonSix, fine, punish, userId);
				list.add(punishment);
			}
			return list;
		}

		finally {
			close(connection, preparedStatement, resultSet);
		}
	}

	public List<Document> getDocument() throws SQLException {
		// TODO Auto-generated method stub
		List<Document> list = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from document";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nid = resultSet.getString("nid");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				Document document=new Document(id, nid, drivingLicense, vehicleLicense);
				list.add(document);
			}
			return list;
		}

		finally {

			close(connection, statement, resultSet);
		}
	}

	public User getUserDocumentById(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user=null;
		try {
			connection = DB.getCon();
			String query = "select nid,drivingLicense,vehicleLicense from users where id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String nid = resultSet.getString("nid");
				String drivingLicense = resultSet.getString("drivingLicense");
				String vehicleLicense = resultSet.getString("vehicleLicense");
				user=new User(id,nid,drivingLicense,vehicleLicense);
			}
		}
		finally {
			close(connection, preparedStatement, resultSet);
		}
		return user;
	}

	public boolean isValidDocument(User user) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from users where nid=? and drivingLicense=? and vehicleLicense=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getNid());
			preparedStatement.setString(2, user.getDrivingLicense());
			preparedStatement.setString(3, user.getVehicleLicense());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		}
		finally {
			close(connection, preparedStatement, resultSet);
		}
		return false;
	}

	public void getData() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DB.getCon();
			String query = "select * from user";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				String name=resultSet.getString("name");
				System.out.println(name);
			}
		}
		finally {

			close(connection, statement, resultSet);
		}
	}
}
