import java.awt.Color;

public class beerList {
	public static void main(String[] args) {
		GTerm gt = new GTerm(800, 400);

		// Test input : VB, A, 5, 4.55, true

		gt.setBackgroundColor(153, 0, 153);
		gt.setFontColor(Color.MAGENTA);
		gt.setFontStyle(5);
		gt.setFontColor(Color.white);
		gt.setFontSize(18);
		
		//Variable intilisation
		char beerScore;
		String beerName;
		int beerStock = 0;
		double beerCost;
		boolean beerGood;

		//intitialistion of Integer vairable and user input for how many times this program loops

		int beerNumber =Integer.parseInt(gt.getInputString("How many beers do you want to review?"));
		int stop = 0;
		//initilising while method using Integer variables created
		while(stop<beerNumber) {
		//creating user input
		String userInput = gt.getInputString(
				"Please enter each using a comma: Beers name, Score for A to F,"
				+ " How many you have in stock, How much does the beer cost?, Have you drank this beer?");
		String [] userAnswer= userInput.split(", ");
		
		//using .split to create string variable	
		beerName= userAnswer[0];
			while(beerName.isBlank())
				beerName = gt.getInputString("Please enter the beers name.");
		// using .split to create Char variable
		beerScore = userAnswer[1].charAt(0);
			while(Character.isAlphabetic(beerScore) == false)
					beerScore = gt.getInputString("Please re-enter a score from A to F").charAt(0);
		// using .split to create Integer variable				
		beerStock = Integer.parseInt(userAnswer[2]);
			while(beerStock <=0)
				beerStock = Integer.parseInt(gt.getInputString("Please enter how many " + beerName + " you have in stock"));
		//using .split to create double variable	
		beerCost = Double.parseDouble(userAnswer[3]);
			while(beerCost <= 0)
				beerCost = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));
		//using .split to create boolean variable	
		beerGood = Boolean.parseBoolean(userAnswer[4]);
			while(!beerGood)
				beerGood = Boolean.parseBoolean(gt.getInputString("If you haven't Drank the beer what are you rating is. Please enter true to continue"));
			
		// using string variable to create message output	 
		String message = beerName + ", " +  beerScore +", " + 
			beerStock + ", " + beerCost + ", " + beerGood;
		gt.println(message);
				
		stop+=1;
		

		}
		int stockAverage;
		stockAverage = beerStock / beerNumber;
		
		gt.println("your stock average is " + stockAverage);
		// gt.showHelp();
	nm u
	}
}
