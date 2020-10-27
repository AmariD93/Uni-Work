import java.awt.Color;
import java.util.Arrays;
public class beerArray {
	
	
	private GTerm gt;
	
	
	
	public beerArray() {
		
	}
	
	public static void main(String[] args) {
		GTerm gt = new GTerm(420, 400);

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

		String beerName;
		char beerScore;
		int beerStock;
		double beerCost;
		boolean beerGood;

		String columns;
		columns = "Beer name\tRating\tStock\tCost\t";
		gt.addTable(400, 300, columns);
		gt.println("");

		double costAverage;
		double sumC = 0;
		int x = 0;
		int minArrayIndex=0;

		while (x < beerNumber) {
			String userInput = gt.getInputString("Beer " + (x + 1) + "\nBeers name, Score for A to F,"
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

			beerGood = Boolean.parseBoolean(userAnswer[4]);

			while (!beerGood)
				beerGood = Boolean.parseBoolean(gt.getInputString(
						"If you haven't Drank the beer what are you rating is. Please enter true to continue"));

			beerNames[x] = beerName;
			beerScores[x] = beerScore;
			beersStock[x] = beerStock;
			beerCosts[x] = beerCost;
			beersGood[x] = beerGood;
						
			if (beersStock[x] < beersStock[minArrayIndex])
				minArrayIndex = x;

			String message = beerNames[x] + "\t " + beerScores[x] + "\t " + beersStock[x] + "\t " + "$" + beerCosts[x];

			gt.addRowToTable(0, message);

			sumC += beerCosts[x];

			x += 1;

		}

		String lowestBeer = beerNames[minArrayIndex] + "\t " + beerScores[minArrayIndex] + "\t "
				+ beersStock[minArrayIndex] + "\t " + "$" + beerCosts[minArrayIndex];

		costAverage = sumC / beerNumber;
		gt.println("Your cost average is " + costAverage);

		Arrays.sort(beersStock);
		double median;
		int sumOfEvenMedian = 0;
		int arrayLength = beersStock.length;

		if (arrayLength % 2 == 0) {
			sumOfEvenMedian = beersStock[arrayLength / 2] + beersStock[arrayLength / 2 - 1];
		median = ((double) sumOfEvenMedian) / 2;
		}
		else
		     median = (double) beersStock[beersStock.length/2];
		
		gt.println("median is: " + median);
		
		gt.showMessageDialog("Press ok to see the beer with lowest stock");
		gt.clearRowsOfTable(0);
		gt.addRowToTable(0, lowestBeer);

		// gt.showHelp();

	}
}
