package program;

/**
 * Author: OffStef
 * Last modified: 12/03/2024
 */

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

		method.banner();

		switch (method.initialMenuChoice()) {
		case 1:
			// creating an user
			method.characterCreation(user);
			// setting difficulty
			method.chooseDifficulty(user);
			wallet.WalletCuantity(user);
			// first boss challenge
			method.presentationBoss(user, vladimir);
			responses = method.bossQuestions(vladimir);
			method.responseChecker(vladimir, user, wallet, responses);
			// second boss challenge
			method.presentationBoss(user, snake);
			responses = method.bossQuestions(snake);
			method.responseChecker(snake, user, wallet, responses);
			// third boss challenge
			method.presentationBoss(user, butterfly);
			responses = method.bossQuestions(butterfly);
			method.responseChecker(butterfly, user, wallet, responses);

			// final response if passes the game
			System.out.println("Congratulations!, you´ve completed the game...");
			break;
		case 2:
			method.bossesViewer();
			break;
		case 3:
			Boss userBoss = method.userCreatesBoss();
			Boss modifiedUserBoss = method.userChecksBoss(userBoss);
			method.userNewBossUpdated(userBoss, modifiedUserBoss);
			break;
		case 4:
			method.instructions();
			break;
		default:
			System.out.println("Try again");
			break;
		}

	}

}
