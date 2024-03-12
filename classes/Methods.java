package classes;

import java.util.Scanner;

public class Methods {
	static Scanner keyboardInput = new Scanner(System.in);

	// CryptoScam banner
	public void banner() {
		System.out.println("▄████▄  ██▀███▓██   ██▓██▓███ ▄▄▄█████▓▒█████   ██████ ▄████▄  ▄▄▄      ███▄ ▄███▓");
		System.out.println("▒██▀ ▀█ ▓██ ▒ ██▒██  ██▓██░  ██▓  ██▒ ▓▒██▒  ██▒██    ▒▒██▀ ▀█ ▒████▄   ▓██▒▀█▀ ██▒");
		System.out.println("▒▓█    ▄▓██ ░▄█ ▒▒██ ██▓██░ ██▓▒ ▓██░ ▒▒██░  ██░ ▓██▄  ▒▓█    ▄▒██  ▀█▄ ▓██    ▓██░");
		System.out.println("▒▓▓▄ ▄██▒██▀▀█▄  ░ ▐██▓▒██▄█▓▒ ░ ▓██▓ ░▒██   ██░ ▒   ██▒▓▓▄ ▄██░██▄▄▄▄██▒██    ▒██ ");
		System.out.println("▒ ▓███▀ ░██▓ ▒██▒░ ██▒▓▒██▒ ░  ░ ▒██▒ ░░ ████▓▒▒██████▒▒ ▓███▀ ░▓█   ▓██▒██▒   ░██▒");
		System.out.println("░ ░▒ ▒  ░ ▒▓ ░▒▓░ ██▒▒▒▒▓▒░ ░  ░ ▒ ░░  ░ ▒░▒░▒░▒ ▒▓▒ ▒ ░ ░▒ ▒  ░▒▒   ▓▒█░ ▒░   ░  ░");
		System.out.println("  ░  ▒    ░▒ ░ ▒▓██ ░▒░░▒ ░        ░     ░ ▒ ▒░░ ░▒  ░ ░ ░  ▒    ▒   ▒▒ ░  ░      ░ ");
		System.out.println("░         ░░   ░▒ ▒ ░░ ░░        ░     ░ ░ ░ ▒ ░  ░  ░ ░         ░   ▒  ░      ░   ");
		System.out.println("░ ░        ░    ░ ░                        ░ ░       ░ ░ ░           ░  ░      ░   ");
		System.out.println("░               ░ ░                                    ░                           ");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
	}

	/**
	 * Initial menu options and prompts the user to choose an action.
	 *
	 * @return The integer representing the user's choice. 1 for playing the game, 2
	 *         for viewing the bosses, 3 for creating a custom boss, 4 for viewing
	 *         the instructions.
	 */
	public int initialMenuChoice() {
		System.out.println("What would you like to do");
		System.out.println("1. play the game");
		System.out.println("2. see the bosses");
		System.out.println("3. create your own boss");
		System.out.println("4. see the instructions");
		int choice = keyboardInput.nextInt();
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		keyboardInput.nextLine();
		return choice;
	}

	/**
	 * Character creation process for the user by collecting alias and country
	 * information.
	 * 
	 * @param user The User object to which the created character information will
	 *             be assigned.
	 * @return The User object with updated alias and country information.
	 */
	public User characterCreation(User user) {
		banner();
		System.out.print("🚩Alias: ");
		String alias = keyboardInput.next();
		user.setAlias(alias);

		System.out.print("🎯Country: ");
		String country = keyboardInput.next();
		user.setCountry(country);

		return user;
	}

	/**
	 * User chooses the game difficulty level and sets it for him.
	 * 
	 * @param user object for which the difficulty level will be set.
	 */
	public void chooseDifficulty(User user) {
		System.out.println("Okey, " + user.toString() + ", now you have to choose your difficulty");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("1 --> Easy peasy (easy asf)");
		System.out.println("2 --> Mezzo (medium level)");
		System.out.println("3 --> Difficile (a true challenge)");
		System.out.println("4 --> European extreme (only for experts)");
		user.setDifficultyChoice(keyboardInput.nextInt());
	}

	/**
	 * Presentation of the boss to the user.
	 * 
	 * @param user The User object to whom the boss presentation is addressed.
	 * @param boss The Boss object representing the boss to be presented.
	 */

	public void presentationBoss(User user, Boss boss) {
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println(user.getAlias());
		System.out.println("This is your objective, steal as much as possible");
		System.out.println("♠" + boss.getName() + "\n♥" + boss.getBitcoinWealth() + "BTC\n" + "♦" + boss.getCountry());
	}

	/**
	 * Generates and presents password questions based on the boss's attributes.
	 * 
	 * @param boss object for which password questions will be generated.
	 * @return array of user responses corresponding to the password questions.
	 */
	public String[] bossQuestions(Boss boss) {
		String[] password = boss.getPassword();
		String[] responsesBoss = new String[password.length];
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		switch (boss.getName()) {
		case "Vladimir A.K.A vodka till coma":
			for (int i = 0; i < password.length; i++) {
				switch (password[i]) {
				case "vodka":
					System.out.println("What´s the most dricked alcohol in Russia?");
					break;
				case "bear":
					System.out.println("What fighted Khabib as a child?");
					break;
				case "horse":
					System.out.println("What has a human on top of it and appears on Ferrari´s logo?");
					break;
				case "cocaine":
					System.out.println("What drug is the most used on Wall Street?");
					break;
				case "ak47":
					System.out.println("I´m a gun powerful and cheap, easily buyed on Sudan");
					break;
				case "communism":
					System.out.println("I´m a ideology, that some German dude created and the " + "Russians adopted");
					break;
				}
				responsesBoss[i] = keyboardInput.next();
				keyboardInput.nextLine();
			}
			break;
		case "Snake the unfaithful":
			for (int i = 0; i < password.length; i++) {
				switch (password[i]) {
				case "jagger":
					System.out.println("Licor that´s dark, made from herbs and german");
					break;
				case "whiskey":
					System.out.println("Buckowsky´s favorite drink");
					break;
				case "cat":
					System.out.println("Domestic animal that can purr like a V8 engine");
					break;
				case "copper":
					System.out.println("What do the romanians steal, nah I´m joking, what are cables made of?");
					break;
				case "marihuana":
					System.out.println("What drug comes from the cannabis?");
					break;
				case "bmw":
					System.out.println("What is the most driven car in romania (not a dacia)");
					break;
				}
				responsesBoss[i] = keyboardInput.next();
				keyboardInput.nextLine();
			}
			break;
		case "Butterfly A.K.A White Death":
			for (int i = 0; i < password.length; i++) {
				switch (password[i]) {
				case "samurai":
					System.out.println("What is the name of the warrior that has a katana");
					break;
				case "anime":
					System.out.println("What is the cartoon asociated with otakus? ");
					break;
				case "mafia":
					System.out.println("A _____ is a organized group, an example is the Yakuzas");
					break;
				case "legend":
					System.out.println("When a epic character dies, his alias will now be L____d");
					break;
				case "katana":
					System.out.println("A samurai has a ....");
					break;
				case "eyes":
					System.out.println("The _____ are used to see");
					break;
				}
				responsesBoss[i] = keyboardInput.next();
				keyboardInput.nextLine();
			}

			break;
		}
		return responsesBoss;

	}

	/**
	 * Checks the user's responses against the boss's password questions, calculates
	 * the steal amount, penalization, and updates the user's wallet accordingly.
	 *
	 * @param boss      object representing the boss whose password questions are
	 *                  being answered.
	 * @param user      object representing the user who is answering the password
	 *                  questions.
	 * @param wallet    object representing the user's wallet.
	 * @param responses array containing the user's responses to the boss's password
	 *                  questions.
	 * @return updated amount of Bitcoin in the user's wallet after the stealing and
	 *         penalization process.
	 */
	public double responseChecker(Boss boss, User user, WalletMaths wallet, String[] responses) {
		String[] password = boss.getPassword();
		double steal = 0;
		double penalisation = 0;
		double walletNewAmount = 0;
		double totalSteal = 0;
		double totalPenalisation = 0;
		int difficulty = user.getDifficultyChoice();

		for (int i = 0; i < password.length; i++) {
			if (password[i].equalsIgnoreCase(responses[i])) {
				steal++;
			} else {
				penalisation++;
			}
		}
		switch (difficulty) {
		case 1:
			totalSteal = steal * 2;
			totalPenalisation = penalisation * 0.5;
			break;
		case 2:
			totalSteal = steal * 2;
			totalPenalisation = penalisation * 1;
			break;
		case 3:
			totalSteal = steal * 0.5;
			totalPenalisation = penalisation * 1.5;
			break;
		case 4:
			totalSteal = steal * 2.5;
			totalPenalisation = penalisation * 5;
			break;
		}
		walletNewAmount = wallet.getUserInitialWealth() + (totalSteal - totalPenalisation);
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		if (walletNewAmount > 0) {
			System.out.println("You now have " + walletNewAmount + "BTC");
			wallet.setUserInitialWealth(walletNewAmount);
		} else {
			System.out.println("You losed HAHAHAHAHAHAHHA");
			banner();
			System.exit(0);
		}
		return walletNewAmount;
	}

	/**
	 * Information about the bosses without revealing their passwords.
	 * 
	 * The method prints information about each boss's name, nationality, and
	 * wealth, excluding their passwords. It also includes a banner at the beginning
	 * and end of the display.
	 */
	public void bossesViewer() {
		banner();
		System.out.println("The first wallet it´s propiety of");
		System.out.println(Boss.firstBoss().toStringWithoutPassword());
		System.out.println();

		System.out.println("The second wallet it´s propiety of");
		System.out.println(Boss.secondBoss().toStringWithoutPassword());
		System.out.println();

		System.out.println("The third wallet it´s propiety of");
		System.out.println(Boss.thirdBoss().toStringWithoutPassword());
		System.out.println("I can´t say you the password of each wallet, it´s secret... shhh");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
	}

	/**
	 * Allows the user to create a custom boss with a name, country, wealth, and
	 * password.
	 * 
	 * @return object representing the custom boss created by the user.
	 */
	public Boss userCreatesBoss() {
		Boss boss = new Boss();
		System.out.println("So you want to be creative huh...");
		System.out.print("Give him a name: ");
		String name = keyboardInput.nextLine();
		System.out.print("What´s his country?: ");
		String country = keyboardInput.nextLine();
		System.out.print("How many BTC will manage?: ");
		double wealth = keyboardInput.nextDouble();
		keyboardInput.nextLine();
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("Now you are going to create a password");
		String[] password = new String[6];
		System.out.println("Introduce the password by order");
		System.out.println("Dont forget it and write it somewhere");
		for (int i = 0; i < password.length; i++) {
			System.out.println("word number " + (i + 1));
			password[i] = keyboardInput.next();
		}
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		boss.setName(name);
		boss.setCountry(country);
		boss.setBitcoinWealth(wealth);
		boss.setPassword(password);

		return boss;
	}

	/**
	 * Allows the user to view or modify a boss. User sees his boss and changes
	 * something if he wants.
	 * 
	 * @param boss object to be viewed or modified.
	 * @return object modified based on user's choice.
	 */
	public Boss userChecksBoss(Boss boss) {
		System.out.println("What you want to do?: ");
		System.out.println("1. see the boss I created");
		System.out.println("2. modify the boss");
		int option = keyboardInput.nextInt();

		switch (option) {
		case 1:
			System.out.println(boss.toString());
			break;
		case 2:
			boss = modifyBoss(boss);
			break;
		default:
			System.out.println("That option is not available");
			break;
		}
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		return boss;
	}

	/**
	 * Allows the user to modify aspects of a boss, such as name, country, or
	 * Bitcoin wealth.
	 * 
	 * @param boss object to be modified.
	 * @return modified Boss object.
	 */
	private Boss modifyBoss(Boss boss) {
		System.out.println("What you want to modify?:");
		System.out.println("1. the name of your boss");
		System.out.println("2. the country of your boss");
		System.out.println("3. the amount of BTC");
		System.out.println("4. your past decisions that you have made along your life");
		int option = keyboardInput.nextInt();
		keyboardInput.nextLine();
		switch (option) {
		case 1:
			System.out.println("Specify your boss name: ");
			String newName = keyboardInput.nextLine();
			boss.setName(newName);
			break;
		case 2:
			System.out.println("Specify your boss country: ");
			String newCountry = keyboardInput.nextLine();
			boss.setCountry(newCountry);
			break;
		case 3:
			System.out.println("Specify the amount of BTC: ");
			double newWealth = keyboardInput.nextDouble();
			boss.setBitcoinWealth(newWealth);
			break;
		case 4:
			System.out.println("You don´t need that...");
			System.out.println("Your life is awesome, live it fully");
			System.out.println("Enjoy the little gifts that are given to you");
			System.out.println("Spread love and consciousness among others");
			break;
		default:
			System.out.println("That option is not available");
			break;
		}
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		return boss;
	}

	/**
	 * Updated boss information if modifications were made, otherwise displays the
	 * original boss information.
	 * 
	 * @param originalBoss original Boss object.
	 * @param modifiedBoss modified Boss object.
	 */
	public void userNewBossUpdated(Boss originalBoss, Boss modifiedBoss) {
		if (!originalBoss.equals(modifiedBoss)) {
			System.out.println("This is your final boss (modified):");
			System.out.println(modifiedBoss.toStringWithoutPassword());
		} else {
			System.out.println("No modifications made, your original boss remains:");
			System.out.println(originalBoss.toStringWithoutPassword());
		}
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
	}

	/**
	 * Game instructions, including the objective, rules, and available options.
	 */
	public void instructions() {
		System.out.println("This game is very simple. You are a Hacker who has a");
		System.out.println("program with an AI, that helps you find wallets. Once you");
		System.out.println("find them, you will have to decrypt the password that");
		System.out.println("secures them. For each correct answer, you will steal");
		System.out.println("X amount of money based on the difficulty you choose.");
		System.out.println("If you fail a question, you will lose money too, so");
		System.out.println("be careful. Good luck completing the game! There are");
		System.out.println("some other available options like creating your own");
		System.out.println("boss or reading these instructions, so make sure you");
		System.out.println("pass the game and have fun!");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("Each difficulty starting money,penalisation, and the amount that steals:");
		System.out.println("EASY ---------------- 10	/	0.5	/	2");
		System.out.println("MEDIUM -------------- 10	/	1	/	2");
		System.out.println("HARD ---------------- 7.5	/	2	/	0.5");
		System.out.println("EUROPEAN EXTREME ---- 10	/	5	/	2.5");
		banner();
	}

}
