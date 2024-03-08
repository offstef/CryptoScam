package classes;

public class WalletMaths {
	Methods method = new Methods();
	private double userInitialWealth;

	public double getUserInitialWealth() {
		return userInitialWealth;
	}

	public void WalletCuantity(User user) {

		switch (user.getDifficultyChoice()) {
		case 1:
			this.userInitialWealth = 100;
			break;
		case 2:
			this.userInitialWealth = 50;
			break;
		case 3:
			this.userInitialWealth = 25;
			break;
		case 4:
			this.userInitialWealth = 5;
			break;
		default:
			System.out.println("Try again...");
			method.chooseDifficulty(user);
			WalletCuantity(user);
			break;
		}
	}

}
