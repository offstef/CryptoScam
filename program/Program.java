package program;

import classes.Methods;
import classes.User;
import classes.WalletMaths;
import classes.Boss;

public class Program {

	public static void main(String[] args) {

		// initializing methods class from classes package
		Methods method = new Methods();
		WalletMaths wallet = new WalletMaths();
		User user = new User();
		String[] responses;

		// bosses integration
		Boss vladimir = Boss.firstBoss();
		Boss butterfly = Boss.secondBoss();
		Boss snake = Boss.thirdBoss();

		// creating an user
		method.characterCreation(user);

		// setting difficulty
		method.chooseDifficulty(user);
		wallet.WalletCuantity(user);

		// first boss challenge
		method.presentationBoss(user, vladimir);
		responses = method.firstBossQuestions(vladimir);
		method.responseChecker(vladimir, user, wallet, responses);

	}

}
