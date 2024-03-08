package classes;

import java.util.Scanner;

public class Methods {
	static Scanner keyboardInput = new Scanner(System.in);

	// user creation with his respective country
	public User characterCreation(User user) {

		System.out.print("Alias: ");
		String alias = keyboardInput.next();
		user.setAlias(alias);

		System.out.print("Country: ");
		String country = keyboardInput.next();
		user.setCountry(country);

		return user;
	}

	// he chooses his difficulty
	public void chooseDifficulty(User user) {

		System.out.println("Okey, " + user.toString() + ", now you have to choose your difficulty");

		System.out.println("1 --> Easy peasy (easy asf)");
		System.out.println("2 --> Mezzo (medium level)");
		System.out.println("3 --> Difficile (a true challenge)");
		System.out.println("4 --> European extreme (only for experts)");
		user.setDifficultyChoice(keyboardInput.nextInt());
	}

	// method that presents the boss

	public void presentationBoss(User user, Boss boss) {

		System.out.println("The game has started, " + user.getAlias());
		System.out.println("It´s time for a real challenge...");
		System.out.println("I´ve found the wallet of pretty strange person...");
		System.out.println("Known as " + boss.getName() + ", in his wallet I´ve found a total of "
				+ boss.getBitcoinWealth() + " BTC");
		System.out.println("and it´s actually located on " + boss.getCountry());
	}

	public String[] firstBossQuestions(Boss vladimir) {
		String[] password = vladimir.getPassword();
		String[] responsesFirstBoss = new String[password.length];

		for (int i = 0; i < password.length; i++) {
			switch (password[i]) {
			case "vodka":
				System.out.println("pregunta a ");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			case "bear":
				System.out.println("pregunta b");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			case "horse":
				System.out.println("pregunta c ");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			case "cocaine":
				System.out.println("pregunta d ");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			case "ak47":
				System.out.println("pregunta e ");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			case "communist":
				System.out.println("pregunta f ");
				responsesFirstBoss[i] = keyboardInput.next();
				break;
			}
		}

		return responsesFirstBoss;
	}

	// method that checks the password with the user responses

	public void responseChecker(Boss boss, User user, WalletMaths wallet) {
		String[] password = boss.getPassword();
		String[] responses = firstBossQuestions(boss);
		double steal = 0;
		double penalisation = 0;
		double walletNewAmount = 0;
		double totalSteal = 0;
		double totalPenalisation = 0;
		int difficulty = user.getDifficultyChoice();

		for (int i = 0; i < password.length; i++) {
			if (password[i] == responses[i]) {
				steal++;
			}
			if (password[i] != responses[i]) {
				penalisation++;
			}
		}
		switch (difficulty) {
		case 1:
			totalSteal = steal * 10;
			totalPenalisation = penalisation * 2.5;
			break;
		case 2:
			totalSteal = steal * 30;
			totalPenalisation = penalisation * 3;
			break;
		case 3:
			totalSteal = steal * 25;
			totalPenalisation = penalisation * 4.7;
			break;
		case 4:
			totalSteal = steal * 5;
			totalPenalisation = penalisation * 2.5;
			break;
		}
		walletNewAmount = wallet.getUserInitialWealth() + (totalSteal - totalPenalisation);
		System.out.println(walletNewAmount);
		

	}

}
