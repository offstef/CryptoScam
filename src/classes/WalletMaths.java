package classes;

public class WalletMaths {
	Methods method = new Methods();
	private double userInitialWealth;

	public void setUserInitialWealth(double userInitialWealth) {
		this.userInitialWealth = userInitialWealth;
	}

	public double getUserInitialWealth() {
		return userInitialWealth;
	}

	/**
	 * Sets the initial wallet amount for the user based on the selected difficulty.
	 * The initial wallet amount is determined based on the difficulty chosen by the
	 * user.
	 *
	 * @param user The user for whom the initial wallet amount will be set.
	 */
	public void walletCuantity(User user) {

		switch (user.getDifficultyChoice()) {
		case 1:
			this.userInitialWealth = 10;
			break;
		case 2:
			this.userInitialWealth = 10;
			break;
		case 3:
			this.userInitialWealth = 7.5;
			break;
		case 4:
			this.userInitialWealth = 5;
			break;
		default:
			System.out.println("Try again...");
			// This is a loop until a valid difficulty is selected.
			method.chooseDifficulty(user);
			walletCuantity(user);
			break;
		}
	}

}
