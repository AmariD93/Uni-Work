import java.awt.Color;

public class whileIWait {
	public static void main(String[] args) {
		GTerm gt = new GTerm(800, 400);

		/*
		 * String userName = "jeni"; char userGender = 'M'; int userFunds = 100;
		 * doublebeerCost = 2.79; boolean doYouHaveTime = true;
		 */
		// Test Input - Daniel, M, 43, 5.87, True

		gt.setBackgroundColor(153, 0, 153);
		gt.setFontColor(Color.MAGENTA);
		gt.setFontStyle(5);
		gt.setFontColor(Color.white);
		gt.setFontSize(18);

		String userInput = gt.getInputString("Please enter each using a comma: First name, "
				+ "What is your Gender, How much do you have to spend?, How Much does each beer cost?,"
				+ " Do you have time?-true/false");
		String[] studentInput = userInput.split(", ");

		String userName = studentInput[0];
		char userGender = studentInput[1].charAt(0);
		int userFunds = Integer.parseInt(studentInput[2]);
		float beerCost = Float.parseFloat(studentInput[3]);
		boolean doYouHaveTime = Boolean.parseBoolean(studentInput[4]);

		gt.println("Oi!" + userName + "!");

		// use of char for if else statement, us of "||" to allow two possible input for
		// the same output

		if (userGender == 'M' || userGender == 'm') {
			gt.println("How are you mate?");

		} else if (userGender == 'F' || (userGender == 'f')) {
			gt.println("How are you Gurl!?");
		}

		else {
			gt.println("You have entered in something wrong");
		}

		// Pointless string but keeps the flow
		gt.println("How have you been? do you want to have a drink?");

		// Use of integers in if else statements with a "&&" to show variety of two
		// rules

		if (userFunds <= 10) {
			gt.println("Oft! its doesn't looks like you have much money should you be drinking?");
		} else if (userFunds >= 10 && (userFunds <= 50)) {
			gt.println("You can definitely afford to have a few drinks with me.");
		} else {
			gt.println("Awesome, so your shout tonight?");
		}

		// Use of arithmetic symbols and Integer and doubles to create interesting line
		// this is then
		// also used in if else statements

		double howMany = (userFunds / beerCost);
		howMany = Math.round(howMany);

		if (howMany <= 1) {
			gt.println("maybe you should get a cheaper drink.");

		} else if (howMany >= 1 && (howMany <= 6)) {
			gt.println("Nice we can hang out for a few hours.");
		} else {
			gt.println("Looks like we are going to be here all night.");
		}

		// Use of Boolean to create if else statements.

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
		message += ("You can have " + howMany + " beers." + "\n");
		message += ("do you have time? " + doYouHaveTime);
		gt.showMessageDialog(message);

	
		// gt.showHelp();
	}
}
