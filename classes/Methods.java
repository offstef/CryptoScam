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
	// method that saves every response in order
	
	// method that checks the password with the user responses
	
	public void passwordChecker(Boss boss) {
		String[] password = boss.getPassword();
		
		for (int i = 0; i < password.length; i++) {
			if(password[i] == "a") {
				
			}
		}
	}

}
