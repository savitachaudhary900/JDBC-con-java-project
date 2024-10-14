package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {

	public List<Player> getAllPlayers() throws SQLException {
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1199db";
		String uname = "root";
		String pwd = "root";

		String sql = "SELECT * FROM player";
		List<Player> allplayersList = null;
		
		try {
			Class.forName(path);

			Class.forName(path);
			System.out.println("Driver Loaded-----------1");

			Connection conn = DriverManager.getConnection(url, uname, pwd);

			System.out.println("Connected to the Database-------2");

			Statement st = conn.createStatement();
			System.out.println("Statement Created--------3");

			ResultSet rs = st.executeQuery(sql);
			System.out.println("Query Executed-------4");
			System.out.println("--------------------------------------------------");

			allplayersList = new ArrayList<Player>();
			
			while (rs.next()) {
				int jm = rs.getInt("jm");
				String name = rs.getString("name");
				int runsl = rs.getInt("runsl");
				int vickets = rs.getInt("vickets");
				String tname = rs.getString("tname");
				Player obj = new Player(jm, name, runsl, vickets, tname);
				allplayersList.add(obj);

//				System.out.printf("|%-5s||%-10s||&-10s||%-10s||%-10s|\n", jm, name, runsl, vickets, tname);
//				System.out.println("--------------------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return allplayersList;
	}

}
