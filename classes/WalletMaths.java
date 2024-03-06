package classes;

public class WalletMaths {
	Methods method = new Methods();
	private double userInitialWealth;
	private double penalistaionWrongAnswer;
	private double amountUserSteals;

	public void WalletCuantity(User user) {

		switch (user.getDifficultyChoice()) {
		case 1:
			this.userInitialWealth = 100;
			this.penalistaionWrongAnswer = 2.5;
			this.amountUserSteals = 10;
			break;
		case 2:
			this.userInitialWealth = 50;
			this.penalistaionWrongAnswer = 2.5;
			this.amountUserSteals = 30;
			break;
		case 3:
			this.userInitialWealth = 25;
			this.penalistaionWrongAnswer = 4.7;
			this.amountUserSteals = 60;
			break;
		case 4:
			this.userInitialWealth = 5;
			this.penalistaionWrongAnswer = 2.5;
			this.amountUserSteals = 5;
			break;
		default:
			System.out.println("Try again...");
			method.chooseDifficulty(user);
			WalletCuantity(user);
			break;
		}
	}
}
