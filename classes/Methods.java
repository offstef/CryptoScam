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

	public String[] bossQuestions(Boss boss) {
		String[] password = boss.getPassword();
		String[] responsesBoss = new String[password.length];

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
			            System.out.println("I´m a ideology, that some German dude created and the "
			            		+ "Russians adopted");
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
			            System.out.println("What is the name of the psychoactive drug derived "
			            		+ "from the Cannabis plant?");
			            break;
			        case "bmw":
			            System.out.println("What is the name of the German luxury automobile "
			            		+ "manufacturer known for its slogan 'The Ultimate Driving Machine'?");
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
			            System.out.println("What is the name of the Japanese warrior "
			            		+ "class known for their military prowess and code of honor?");
			            break;
			        case "anime":
			            System.out.println("What is the name for the style of animation "
			            		+ "that originated in Japan and often features colorful artwork and fantastical themes?");
			            break;
			        case "mafia":
			            System.out.println("What is the name for a secretive organized "
			            		+ "crime syndicate, particularly associated with Italian-American criminal groups?");
			            break;
			        case "legend":
			            System.out.println("What is the term used to describe an unverifiable "
			            		+ "story passed down through generations, often involving extraordinary events or characters?");
			            break;
			        case "katana":
			            System.out.println("What is the name of the traditional Japanese sword "
			            		+ "characterized by its curved, slender, single-edged blade?");
			            break;
			        case "eyes":
			            System.out.println("What are the organs of sight in humans and many "
			            		+ "animals, responsible for detecting light and forming images?");
			            break;
			    }
			    responsesBoss[i] = keyboardInput.next();
			    keyboardInput.nextLine();
			}

			break;
		}return responsesBoss;

	}

	// method that checks the password with the user responses

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
		wallet.setUserInitialWealth(walletNewAmount);
		return walletNewAmount;
	}

}
