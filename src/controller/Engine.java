package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.Client;

/**
 * @author mra2
 * 
 */

public class Engine {

	static final String driver = Messages.getString("Engine.0"); //$NON-NLS-1$
	static final String password = Messages.getString("Engine.1"); // local password //$NON-NLS-1$
	static final String URL = Messages.getString("Engine.2"); //$NON-NLS-1$
	static final String username = Messages.getString("Engine.3"); //$NON-NLS-1$

	public static Connection connectToDatabase(String username, String password)
			throws ClassNotFoundException {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(URL, username, password);
		} catch (ClassNotFoundException exc1) {
			exc1.printStackTrace();
		} catch (SQLException exc2) {
			exc2.printStackTrace();
		}

		return con;
	}

	public void insert(Client c) throws SQLException, ClassNotFoundException {

		int ID = 30;
		String cpf_Func = Messages.getString("Engine.4"); //$NON-NLS-1$
		Connection con = connectToDatabase(username, password);
		Statement stmt = con.createStatement();

		String i = Messages.getString("Engine.5") //$NON-NLS-1$
				+ c.getCpf()
				+ Messages.getString("Engine.6") //$NON-NLS-1$
				+ c.getName()
				+ Messages.getString("Engine.7") //$NON-NLS-1$
				+ c.getDate()
				+ Messages.getString("Engine.8") //$NON-NLS-1$
				+ c.getEmail()
				+ Messages.getString("Engine.9") //$NON-NLS-1$
				+ c.getPhone()
				+ Messages.getString("Engine.10") //$NON-NLS-1$
				+ ID++ + Messages.getString("Engine.11") //$NON-NLS-1$
				+ cpf_Func + Messages.getString("Engine.12"); //$NON-NLS-1$

		stmt.executeQuery(i);
		stmt.close();
		con.close();
	}
}
