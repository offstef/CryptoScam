package classes;

public class User {
	private String alias;
	private String country;
	private int difficultyChoice;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDifficultyChoice() {
		return difficultyChoice;
	}

	public void setDifficultyChoice(int difficultyChoice) {
		this.difficultyChoice = difficultyChoice;
	}

	public User() {
	}

	public User(String alias, String country) {
		this.alias = alias;
		this.country = country;
	}

	public User(int difficultyChoice) {
		this.difficultyChoice = difficultyChoice;
	}

	@Override
	public String toString() {
		return "" + alias + " from " + country;
	}

}