import java.awt.Color;
import java.util.Arrays;

public class beerArray {
	public static void main(String[] args) {
		GTerm gt = new GTerm(420, 350);

		// Test input : VB, A, 5, 4.55, true

		gt.setBackgroundColor(Color.white);
		gt.setFontStyle(5);
		gt.setFontColor(Color.black);
		gt.setFontSize(18);

		// Variable intilisation

		String columns;
		columns = "Beer name\tRating\tStock\tCost\t";
		gt.addTable(400, 300, columns);
		gt.println("");

		int beerNumber = Integer.parseInt(gt.getInputString("How many beers do you want to review?"));

		String[] beerName = new String[beerNumber];
		char[] beerScore = new char[beerNumber];
		int[] beerStock = new int[beerNumber];
		double[] beerCost = new double[beerNumber];
		boolean[] beerGood = new boolean[beerNumber];

		double costAverage;
		int stockAverage;
		double sumC = 0;
		int sumS = 0;
		
		int x = 0;
		while (x < beerNumber) {

			beerName[x] = gt.getInputString("Beer " + (x + 1) + "\nEnter Beer name");
			while (beerName[x].isBlank()) {
				beerName[x] = gt.getInputString("Please enter a name for Beer " + (x + 1));
			}

			beerScore[x] = gt.getInputString(beerName[x] + "\nEnter score A to F for " + beerName[x]).charAt(0);
			while (Character.isAlphabetic(beerScore[x]) == false) {
				beerScore[x] = gt.getInputString("Please enter a Score for " + beerName[x]).charAt(0);
			}

			beerStock[x] = Integer
					.parseInt(gt.getInputString(beerName[x] + "\nEnter amount of " + beerName[x] + " stock"));
			while (beerStock[x] < 0) {
				beerStock[x] = Integer
						.parseInt(gt.getInputString("Please enter how many " + beerName[x] + "'s you have"));
			}

			beerCost[x] = Double.parseDouble(gt.getInputString(beerName[x] + "\nEnter cost of " + beerName[x]));
			while (beerStock[x] < 0) {
				beerName[x] = gt.getInputString("Please enter how many " + beerName[x] + "'s you have");
			}

			beerGood[x] = Boolean
					.parseBoolean(gt.getInputString(beerName[x] + "\nHave you tried " + beerName[x] + "?"));
			while (!beerGood[x]) {
				beerGood[x] = Boolean
						.parseBoolean(gt.getInputString("You must have tried " + beerName[x] + "to rate it"));
			}
			
		
			sumC += beerCost[x];
			sumS += beerStock[x];
		
			x += 1;
		}
	
		while (x < beerNumber) {
		String message = beerName[x] + "\t" + beerScore[x] + "\t" + beerStock[x] + "\t" + beerCost[x];
		gt.addRowToTable(0, message);	
		x+=1;
		}
		costAverage = sumC / beerNumber;
		stockAverage = sumS / beerNumber;
		gt.println("Your cost average is " + costAverage);
		gt.println("Your stock average is " + stockAverage);
		
		
		Arrays.sort(beerStock);
		gt.println("The lowest stock you have is " + beerStock[0] );
		gt.println("The highest stock you have is " + beerStock[beerStock.length-1]);

		
	
	}

}