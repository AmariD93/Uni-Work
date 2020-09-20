import java.awt.Color;

public class aWonderfulWorld {
	public static void main(String[] args) {
		GTerm gt = new GTerm(700, 500);

		/*Setting style and font color to String "greeting"
		 */
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		// Print line String greeting
		String greeting = "Hey, you there!" + "\n" + 		
			"Will you tell me your name?";	
		gt.println (greeting);
		
		//Set a dialog box so that text can be seen clearly
		gt.setXY(80, 200);
		gt.addImageIcon("lib/dialogBox.png");
		
		// Setting XY for guide "frog.png
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		//setXY for background image
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
	
		//Create string to be defined by used input. As it is a name, an undefined amount of charcters and symbols 
		//a String is the only option
		String playerName;
		playerName = gt.getInputString("What was your name?");
		
		//This Code Block is used to refresh the page to display a new output,
		// which uses the players input to greet them in playerName
		
			gt.clear();
	
		gt.setXY(100,200);
		gt.setFontSize(20);
		gt.setFontColor(Color.white);
		gt.println(playerName + "! What a great name!" + "\n" + "Do you want to come on an"  + "\n" +  "adventure with me?");
	
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
		
		String pleaseHelp = gt.getInputString("Will you help me?");
		pleaseHelp = pleaseHelp.toLowerCase();
		
		
		
		//This code block is not checking for a Boolean variable from the the input the user gives us
		// the output will be using an if else statement to determine the output message
		
		gt.clear();
		
	if (pleaseHelp.equals("yes"))
	{   
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		gt.println("I'm so happy that you can hang out.");
		
		gt.setFontSize(20);
		gt.println("There are three different paths to take" + "\n" +  
		"Which one should we take?");
		
		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
		
		// user input defines a set of three possible char inputs through converting string to Char
		//each with there own if statements
		//
		String userChoice = gt.getInputString("Which path do you want to take? A, B or C");
		char pathChoice =  userChoice.charAt(0);
		
		if (pathChoice == 'A' || (pathChoice == 'a')) {
			gt.clear();
			
			gt.setXY(95,200);
			gt.setFontSize(18);
			gt.setFontColor(Color.white);
			gt.println("This cafe looks like a nice spot." +"\n" + "Did you want to get something to eat or drink?" + "\n"
			+ "Did you bring your wallet?");
				
		
			gt.setXY(80, 190);
			gt.addImageIcon("lib/dialogBox.png");

			
			gt.setXY(0, 0);
			gt.addImageIcon("lib/Cafe.png");
			
			// I am using integer as I am asking for a whole number from the player
			// with a different output depending on the input using if statements
			int wallet = Integer.parseInt(gt.getInputString("How much do you have?"));
					
			gt.clear();
		    gt.setFontSize(10);
			gt.setXY(80	, 190);
			gt.println("Coffee: $5.60  " + "\n" + 
			"Milk: $3.00" + "\n" + 
			"Slice: $8.90"+ "\n" + 
			"Croissant: $4.50"+ "\n" + 
			"Tea: $3.80"+ "\n");
			 
			
			gt.setXY(80, 190);
			gt.addImageIcon("lib/menuBox.png");
			
			double coffeeCost = 5.60;
			double croissantCost = 4.50;
			double sliceCost = 8.90;
			double milkCost = 3.00;
			double teaCost = 3.80;
				
			gt.setXY(0, 0);
			gt.addImageIcon("lib/Cafe.png");
			
			String allItems = gt.getInputString("Enter amount of items you want: Coffee, milk, croissant, slice, tea.");
			
			String[]perItem = allItems.split(", ");
			int coffeeAmount = Integer.parseInt(perItem[0]);
			int croissantAmount = Integer.parseInt(perItem[1]);
			int sliceAmount = Integer.parseInt(perItem[2]);
			int milkAmount = Integer.parseInt(perItem[3]);
			int teaAmount =Integer.parseInt(perItem[4]);
			
			
			
			//gt.setXY(0, 0);
			//gt.addImageIcon("lib/Cafe.png");
		}
		if (pathChoice == 'B'|| (pathChoice == 'b' )) {
			gt.clear();
			
			
			gt.setXY(0, 0);
			gt.addImageIcon("Cafe.png");
		}
		if (pathChoice == 'C' || (pathChoice == 'c' )) {
			gt.clear();
			
			
			gt.setXY(0, 0);
			gt.addImageIcon("Cafe.png");
		}
		
		
		
	}
	
	else if (pleaseHelp.equals("no")){ 
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		gt.println("That's a shame" + "\n" + "Guess we will hand out next time " + playerName);

		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
		
	}
		
		
		// gt.showHelp();
	}
}
