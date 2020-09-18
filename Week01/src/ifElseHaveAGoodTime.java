public class ifElseHaveAGoodTime {
	public static void main(String[] args) {
		GTerm gt = new GTerm(800, 400);

		String userName = "jeni";
		char userGender = 'M';
		int userFunds = 5;
		double beerCost = 2.79;
		boolean doYouHaveTime = true;

		gt.setFontSize(18);

	/*
		  String userInput = gt.getInputString("Please enter each using a comma: First name, What is your Gender, How much do you have to spend?, How Much does each beer cost?, Do you have time?- Yes/No"
		  );
		  
		  String [] studentInput = userInput.split(",");
		  
		  String userName = studentInput[0]; 
		  char userGender = 
		  int userFunds = Integer.parseInt(studentInput[2]); 
		  double beerCost =Double.parseDouble(studentInput[3]); 
		  boolean doYouHaveTime = Boolean.parseBoolean (studentInput[4]);
		 */

		gt.println("Oi!" + userName + "!");

		// This if else statement shows a greeting depending on the gender of the user

		if (userGender == 'M') {
			gt.println("How are you mate?");

		}
		else if (userGender == 'F') {
			gt.println("How are you Gurl!?");
		}

		else {
			gt.println("You have entered in something wrong");
		}

		gt.println("How have you been? do you want to have a drink?");

		// These line show use of if else use in Interger Variable to determine if the
		// can afford to have some drinks with me.

		if (userFunds <= 10) {
			gt.println("Oft! its doesn't looks like you have much money should you be drinking?");
		}
		else if (userFunds >= 10 && (userFunds <= 50)) {
			gt.println("You can definitely afford to have a few drinks with me.");
		} else {
			gt.println("Lucky you, you can drink all night with me.");
		}

		double howMany = (userFunds / beerCost);

		howMany = Math.round(howMany);
		
		
		gt.println("You can have " + (howMany) + " drinks with me.");

		gt.println("" + doYouHaveTime);

		/*
		 * int a = Integer.parseInt(gt.getInputString("select a number betw 1 and 6"));
		 * 
		 * if (a == 1 ) { gt.println("Correct");
		 * 
		 * }if (a == 2) { gt.println("you");
		 * 
		 * }if (a == 3) { gt.println("smell");
		 * 
		 * }if (a == 4) { gt.println("really");
		 * 
		 * }if (a == 5) { gt.println("bad");
		 * 
		 * }if (a == 6) { gt.println("yey");
		 * 
		 * }
		 */
		// gt.showHelp();
	}
}
