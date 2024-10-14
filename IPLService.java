package com.tka.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	IPLDao dao = null;
	List<Player> allplayerList = new ArrayList();

	public List<Player> getAllPlayers() {
		System.out.println("we are in ipl service.......");
		dao = new IPLDao();
		try {
			allplayerList = dao.getAllPlayers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return allplayerList;

	}

}
