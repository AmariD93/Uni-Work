import java.awt.Color;
import java.util.Arrays;

public class BeerTracker {
	// Test input : VB, A, 5, 4.55, true

	private GTerm gt;

	// Setting input loops
	private String beerNumberMax;
	private int beerNumber;
	// User Input
	private String[] userAnswer;
	// Variable containers for user input
	private String beerName;
	private char beerScore;
	private int beerStock;
	private double beerCost;
	private boolean beerGood;
	private double costAverage;
	private String lowestBeer;
	// Setting Default
	private double sumC;
	private int counter;
	private int minArrayIndex;
	private int j;
	// Setting arrays for Variable input
	private String[] beerNames;
	private char[] beerScores;
	private int[] beersStock;
	private double[] beerCosts;
	private boolean[] beersGood;

	public BeerTracker() {

		this.gt = new GTerm(406, 400);
		this.gt.setBackgroundColor(Color.white);
		this.gt.setFontStyle(5);
		this.gt.setFontColor(Color.black);
		this.gt.setFontSize(18);

		gt.addTable(400, 300, "Beer name\tRating\tStock\tCost\tIndex");
		this.gt.println("");
		this.gt.addButton("Add", this, "addRecord");
		this.gt.addButton("More info", this, "moreInfo");
		this.gt.addButton("Close", this, "close");
		this.gt.println("");

		this.beerNumberMax = (gt.getInputString("How many beers do you want to review(Integer)?"));

		while (beerNumberMax.isEmpty()) {
			this.beerNumberMax = gt.getInputString("please enter number of inputs");
			if (this.beerNumberMax != null)
				this.beerNumber = Integer.parseInt(this.beerNumberMax);

		}
		if (beerNumberMax != null) {

			this.beerNumber = Integer.parseInt(this.beerNumberMax);

			this.beerNames = new String[this.beerNumber];
			this.beerScores = new char[this.beerNumber];
			this.beersStock = new int[this.beerNumber];
			this.beerCosts = new double[this.beerNumber];
			this.beersGood = new boolean[this.beerNumber];
		} else {
			this.gt.showErrorDialog("User has Cancelled");
		}

		addRecord();
	}

	public void addRecord() {
		int minArrayIndex = 0;
		this.counter = 0;
		
		while (this.counter < this.beerNumber) {
			this.userAnswer = gt
					.getInputString("Beer " + (this.counter + 1) + "\nBeers name, Score for A to F,"
							+ " How many you have in stock, How much does the beer cost?, Have you drank this beer?")
					.split(", ");

			this.beerName = this.userAnswer[0];
			this.beerScore = this.userAnswer[1].charAt(0);
			this.beerStock = Integer.parseInt(this.userAnswer[2]);
			this.beerCost = Double.parseDouble(this.userAnswer[3]);
			this.beerGood = Boolean.parseBoolean(this.userAnswer[4]);

			if (beerName.isBlank())
				this.beerName = gt.getInputString("Please enter the beers name.");

			if (Character.isAlphabetic(beerScore) == false)
				this.beerScore = gt.getInputString("Please re-enter a score from A to F").charAt(0);

			if (beerStock <= 0)
				this.beerStock = Integer
						.parseInt(this.gt.getInputString("Please enter how many " + beerName + " you have in stock"));


			if (this.beerCost <= 0)
				this.beerCost = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));

			if (!beerGood)
				this.beerGood = Boolean.parseBoolean(gt.getInputString(
						"If you haven't Drank the beer what are you rating is. Please enter true to continue"));
			else {
				this.gt.showMessageDialog("Input added");
			}

			this.sumC = 0;
			this.sumC += this.beerCosts[this.counter];
			this.costAverage = this.sumC / this.beerNumber;

			if (this.beersStock[this.counter] < this.beersStock[minArrayIndex])
				this.counter = minArrayIndex;
			
			this.beerNames[this.counter] = this.beerName;
			this.beerScores[this.counter] = this.beerScore;
			this.beersStock[this.counter] = this.beerStock;
			this.beerCosts[this.counter] = this.beerCost;
			this.beersGood[this.counter] = this.beerGood;

			this.counter++;
			refreshTable();
			
		}
		if (this.counter == this.beerNumber)
			this.gt.showWarningDialog(this.beerNumber + "  Entries Reached");
	}

	
	
	public void refreshTable() {
		this.gt.clearRowsOfTable(0);
		this.j = 0;
		while (this.j < this.beerNumber) {
			this.gt.addRowToTable(0, this.beerNames[this.j] + "\t " + this.beerScores[this.j] + "\t "
					+ this.beersStock[this.j] + "\t " + "$" + this.beerCosts[this.j] + "\t" + (this.j + 1));
			this.j++;

			
		}

	}

	public void moreInfo() {

		this.lowestBeer = this.beerNames[minArrayIndex] + "\t " + this.beerScores[minArrayIndex] + "\t "
				+ this.beersStock[minArrayIndex] + "\t " + "$" + this.beerCosts[minArrayIndex] + "\t"
				+ (minArrayIndex + 1);

		this.gt.showMessageDialog("Press ok to see the beer with lowest stock");
		this.gt.clearRowsOfTable(0);
		this.gt.addRowToTable(0, this.lowestBeer);

		this.gt.println("Your cost average is " + this.costAverage);

		Arrays.sort(this.beersStock);
		double median;
		int sumOfEvenMedian = 0;
		int arrayLength = this.beersStock.length;

		if (arrayLength % 2 == 0) {
			sumOfEvenMedian = this.beersStock[arrayLength / 2] + this.beersStock[arrayLength / 2 - 1];
			median = ((double) sumOfEvenMedian) / 2;
		}

		else
			median = (double) this.beersStock[this.beersStock.length / 2];

		this.gt.println("median is: " + median);

	}

	public void close() {
		this.gt.close();
	}

	// CD, C, 18, 7.45, true
	// Rieschs, B, 17, 3.50, true
	// Asahi, A, 35, 8.65, true

	public static void main(String[] args) {
		BeerTracker prmObj = new BeerTracker();

		// gt.showHelp();

	}
}
