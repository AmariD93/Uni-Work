import java.awt.Color;

public class beerList {
	public static void main(String[] args) {
		GTerm gt = new GTerm(420, 350);

		// Test input : VB, A, 5, 4.55, true

		gt.setBackgroundColor(Color.white);
		gt.setFontStyle(5);
		gt.setFontColor(Color.black);
		gt.setFontSize(18);
		
		//Variable intilisation
		char beerScore;
		String beerName;
		int beerStock = 0;
		double beerCost;
		boolean beerGood;
		
		String columns;
		columns = "Beer name\tRating\tStock\tCost\t";		
		gt.addTable(400, 300, columns);
		gt.println("");
		//Intitialistion of Integer variable and user input for how many times this program loops
		int beerNumber =Integer.parseInt(gt.getInputString("How many beers do you want to review?"));
		double sum = 0;
		int stop = 0;
		//initilising while method using Integer variables created
		while(stop<beerNumber) {
		//creating user input
		String userInput = gt.getInputString(
				"Beer " + (stop + 1) + "\nBeers name, Score for A to F,"
				+ " How many you have in stock, How much does the beer cost?, Have you drank this beer?");
		String [] userAnswer= userInput.split(", ");
		
		//using .split to create string variable	
		beerName= userAnswer[0];
		//Using while statement to create a requirement for the input
		//condition is that it must not be blank. Alternatively, you can
		//set .length(x) to create a condition that i must have x amount of
		// characters
			while(beerName.isBlank())
				beerName = gt.getInputString("Please enter the beers name.");
		// using .split to create Char variable
		beerScore = userAnswer[1].charAt(0);
		//Using while statement to create a requirement for the input.
		//condition is that it is an alphabetical character.
			while(Character.isAlphabetic(beerScore) == false)
					beerScore = gt.getInputString("Please re-enter a score from A to F").charAt(0);
		// using .split to create Integer variable				
		beerStock = Integer.parseInt(userAnswer[2]);
		//Using while statement to create a requirement for the input
		//condition is that It must numerically be more than 0. Alternatively, you can
		//set a limit to what the use can enter.
			while(beerStock <=0)
				beerStock = Integer.parseInt(gt.getInputString("Please enter how many " + beerName + " you have in stock"));
		//using .split to create double variable	
		beerCost = Double.parseDouble(userAnswer[3]);
		//Using while statement to create a requirement for the input
		//condition is that It must numerically be more than 0. Alternatively, you can
		//set a limit to what the use can enter.
			while(beerCost <= 0)			
				beerCost = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));
			//adding beerCost to sum to calculate average
			sum += beerCost;
		//using .split to create boolean variable
		beerGood = Boolean.parseBoolean(userAnswer[4]);
		//Using while statement to create a requirement for the input
		//condition is that it must be true. Alternatively, you can
		//use (beerGood == false)
			while(!beerGood)
				beerGood = Boolean.parseBoolean(gt.getInputString("If you haven't Drank the beer what are you rating is. Please enter true to continue"));
			
		// using string variable to create message output	 
		String message = beerName + "\t " +  beerScore +"\t " + 
			beerStock + "\t " + "$"+ beerCost ;
		//gt.println(message);
		gt.addRowToTable(0, message);
		stop+=1;
		

		}
		double stockAverage;
		stockAverage = sum / beerNumber;
		
		gt.println("Your cost average is " + stockAverage);
		// gt.showHelp();

	}
}
