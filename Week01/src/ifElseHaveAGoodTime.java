public class ifElseHaveAGoodTime {
	public static void main(String[] args) {
		GTerm gt = new GTerm(800, 400);
		/*
		 * String userName = "jeni"; char userGender = 'M'; int userFunds = 100; double
		 * beerCost = 2.79; boolean doYouHaveTime = true;
		 */

		gt.setFontSize(18);

		String userInput = gt.getInputString("Please enter each using a comma: First name, "
				+ "What is your Gender, How much do you have to spend?, How Much does each beer cost?,"
				+ " Do you have time?-true/false");
		String[] studentInput = userInput.split(" , ");

		String userName = studentInput[0];
		char userGender = studentInput[1].charAt(0);
		int userFunds = Integer.parseInt(studentInput[2]);
		float beerCost = Float.parseFloat(studentInput[3]);
		boolean doYouHaveTime = Boolean.parseBoolean(studentInput[4]);

		gt.println("Oi!" + userName + "!");

		// This if else statement shows a greeting depending on the gender of the user

		if (userGender == 'M' || userGender == 'm') {
			gt.println("How are you mate?");

		} else if (userGender == 'F' || (userGender == 'f')) {
			gt.println("How are you Gurl!?");
		}

		else {
			gt.println("You have entered in something wrong");
		}

		gt.println("How have you been? do you want to have a drink?");

		if (userFunds <= 10) {
			gt.println("Oft! its doesn't looks like you have much money should you be drinking?");
		} else if (userFunds >= 10 && (userFunds <= 50)) {
			gt.println("You can definitely afford to have a few drinks with me.");
		} else {
			gt.println("Awesome, so your shout tonight?");
		}

		double howMany = (userFunds / beerCost);
		howMany = Math.round(howMany);

		if (howMany <= 1) {
			gt.println("maybe you should get a cheaper drink.");

		} else if (howMany >= 1 && (howMany <= 6)) {
			gt.println("Nice we can hang out for a few hours.");
		} else {
			gt.println("looks like we are going to be here all night.");
		}

		if (doYouHaveTime) {
			gt.println("Nice, You have time");
		} else if (!doYouHaveTime) {
			gt.println("Sorry that you don't have time.");
		} else {
			gt.println("Sorry you have enter something wrong");
		}

		String message = " ";
		message += ("First Name: " + userName + "\n");
		message += ("Gender: " + userGender + "\n");
		message += ("You have: $" + userFunds + "\n");
		message += ("Cost per drink: $" + beerCost + "\n");
		message += ("You can have " + howMany + " beers.");

		gt.showMessageDialog(message);

		// gt.showHelp();
	}
}
