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

		
		String userInput = gt.getInputString(
				"Please enter each using a comma: Beers name, Score for A to F, How many you have in stock, How much does the beer cost?, This is a good beer it? True/False ");
		String [] userAnswer= userInput.split(",");
		
		String beerName= userAnswer[0];
		char beerScore = userAnswer[1].charAt(0);
		int beerStock = Integer.parseInt(userAnswer[2]);
		double beerCost = Double.parseDouble(userAnswer[3]);
		boolean beerGood = Boolean.parseBoolean(userAnswer[4]);
		
		
		while(!beerName.equals("Finish"))
		
		gt.println(beerName + "\n" +  beerScore +"\n" +  beerStock + "\n" + beerCost + "\n" + beerGood);
		
		// gt.showHelp();
	}
}
