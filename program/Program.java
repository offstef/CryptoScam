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
		Boss vladimir = new Boss();
		Boss snake = new Boss();
		Boss butterfly = new Boss();

		// bosses integration
		vladimir.firstBoss(vladimir);
		snake.secondBoss(snake);
		butterfly.thirdBoss(butterfly);

		// creating an user
		method.characterCreation(user);

		// setting difficulty
		method.chooseDifficulty(user);
		wallet.WalletCuantity(user);

	}

}
