package com.tka.client;

import java.util.List;

import com.tka.controller.IPLController;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {

		IPLController controller = null;

		controller = new IPLController();

		List<Player> allplayersList = controller.getAllPlayers();

		System.out.println(allplayersList);
	}

}
