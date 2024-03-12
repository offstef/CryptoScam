package classes;

import java.util.Arrays;

public class Boss {
	private String name;
	private String country;
	private double bitcoinWealth;
	private String[] password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getBitcoinWealth() {
		return bitcoinWealth;
	}

	public void setBitcoinWealth(double bitcoinWealth) {
		this.bitcoinWealth = bitcoinWealth;
	}

	public String[] getPassword() {
		return password;
	}

	public void setPassword(String[] password) {
		this.password = password;
	}

	public Boss() {
	}

	public Boss(String name, String country, double bitcoinWealth) {
		this.name = name;
		this.country = country;
		this.bitcoinWealth = bitcoinWealth;
	}

	@Override
	public String toString() {
		return "" + name + ", " + country + ", " + bitcoinWealth + "BTC, " + Arrays.toString(password);
	}

	public String toStringWithoutPassword() {
		return "" + name + ", " + country + ", " + bitcoinWealth + "BTC";
	}

	/**
	 * Creates and returns the boss object with predefined attributes.
	 *
	 * @return The boss object created with a specific name, nationality, and
	 *         health.
	 */

	public static Boss firstBoss() {
		Boss vladimir = new Boss("Vladimir A.K.A vodka till coma", "Rusia", 200.2);

		String[] password = { "vodka", "bear", "horse", "cocaine", "ak47", "communism" };
		vladimir.setPassword(password);
		return vladimir;
	}

	public static Boss secondBoss() {
		Boss snake = new Boss("Snake the unfaithful", "Romania", 130.6);

		String[] password = { "jagger", "whiskey", "cat", "copper", "marihuana", "bmw" };
		snake.setPassword(password);
		return snake;
	}

	public static Boss thirdBoss() {
		Boss butterfly = new Boss("Butterfly A.K.A White Death", "Japan", 69.7);

		String[] password = { "samurai", "anime", "mafia", "legend", "katana", "eyes" };
		butterfly.setPassword(password);
		return butterfly;
	}

}
