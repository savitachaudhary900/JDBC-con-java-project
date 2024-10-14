package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	IPLService service = null;

	public List<Player> getAllPlayers() {
		System.out.println("we are in ipl controller .....");
		service = new IPLService();
		List<Player> allplayerList = service.getAllPlayers();

		return allplayerList;

	}
}
