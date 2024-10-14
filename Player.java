package com.tka.entity;

public class Player {
	private int js;
	private String name;
	private int runs;
	private int wickets;
	private String tname;

	// Constructor
	public Player(int js, String name, int runs, int wickets, String tname) {
		this.js = js;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}

	// Getters and Setters
	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	// Optional: Override toString for a better output when printing object
	@Override
	public String toString() {
		return "Player [js=" + js + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", tname=" + tname
				+ "]";
	}
}
