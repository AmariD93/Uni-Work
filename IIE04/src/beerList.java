import java.awt.Color;

public class beerList {
	public static void main(String[] args) {
		GTerm gt = new GTerm(420, 350);

		// Test input : VB, A, 5, 4.55, true

		gt.setBackgroundColor(Color.white);
		gt.setFontStyle(5);
		gt.setFontColor(Color.black);
		gt.setFontSize(18);

		int beerNumber = Integer.parseInt(gt.getInputString("How many beers do you want to review?"));

		String[] beerNames = new String[beerNumber];
		char[] beerScores = new char[beerNumber];
		int[] beersStock = new int[beerNumber];
		double[] beerCosts = new double[beerNumber];
		boolean[] beersGood = new boolean[beerNumber];

		String columns;
		columns = "Beer name\tRating\tStock\tCost\t";
		gt.addTable(400, 300, columns);
		gt.println("");

		double sum = 0;
		int x = 0;

		while (x < beerNumber) {

			String userInput = gt.getInputString("Beer " + (stop + 1) + "\nBeers name, Score for A to F,"
					+ " How many you have in stock, How much does the beer cost?, Have you drank this beer?");
			String[] userAnswer = userInput.split(", ");

			beerName = userAnswer[0];

			while (beerName.isBlank())
				beerName = gt.getInputString("Please enter the beers name.");

			beerScore = userAnswer[1].charAt(0);

			while (Character.isAlphabetic(beerScore) == false)
				beerScore = gt.getInputString("Please re-enter a score from A to F").charAt(0);

			beerStock = Integer.parseInt(userAnswer[2]);

			while (beerStock <= 0)
				beerStock = Integer
						.parseInt(gt.getInputString("Please enter how many " + beerName + " you have in stock"));

			beerCost = Double.parseDouble(userAnswer[3]);

			while (beerCost <= 0)
				beerCost = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));

			sum += beerCost;

			beerGood = Boolean.parseBoolean(userAnswer[4]);

			while (!beerGood)
				beerGood = Boolean.parseBoolean(gt.getInputString(
						"If you haven't Drank the beer what are you rating is. Please enter true to continue"));

			beerNames[x] = beerName;
			beerScores[x] = beerScore;
			beersStock[x] = beerStock;
			beerCosts[x] = beerCost;
			beersGood[x] = beerGood;

			String message = beerNames + "\t " + beerScores + "\t " + beersStock + "\t " + "$" + beerCosts;

			gt.addRowToTable(0, message);

			x += 1;

		}
		double stockAverage;
		stockAverage = sum / beerNumber;

		gt.println("Your cost average is " + stockAverage);
		// gt.showHelp();

	}
}
