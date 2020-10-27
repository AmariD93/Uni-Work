import java.awt.Color;
import java.util.Arrays;

public class BeerTracker {
	// Test input : VB, A, 5, 4.55, true

	private GTerm gt;

	// Setting input loops
	private String beerNumberMax;
	private int beerNumber;
	
	// Variable containers for user input

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

	private int namesTextField;
	private int ratingTextField;
	private int unitTextField;
	private int costTextField;
	private int stockTextField;

	private String columnNames;

	public BeerTracker() {
		this.gt = new GTerm(406, 400);
		this.minArrayIndex = 0;
		this.sumC = 0;
		this.counter = 0;
		this.j = 0;
		this.beerNumber = 0;
		
		this.beerNumberMax = (gt.getInputString("How many beers do you want to review(Integer)?"));
		
		
		this.gt.setBackgroundColor(Color.white);
		this.gt.setFontStyle(5);
		this.gt.setFontColor(Color.black);
		this.gt.setFontSize(18);

		gt.setBackgroundColor(Color.white);
		gt.setFontColor(Color.BLACK);

		this.columnNames = "Beer Name\t Rating\t Stock\t Cost\t Index";
		gt.addTable(400, 400, columnNames);

		this.gt.setXY(420, 0);
		this.gt.println("Beer Name");
		this.namesTextField = gt.addTextField("", 150);

		gt.println("");
		gt.println("Rating");
		this.ratingTextField = gt.addTextField("", 150);
		gt.println("");

		gt.println("Stock");
		this.ratingTextField = gt.addTextField("", 150);
		gt.println("");

		this.gt.println("Cost");
		this.ratingTextField = this.gt.addTextField("", 150);
		this.gt.println("");

		this.gt.println("Do you stock?");
		this.ratingTextField = this.gt.addTextField("", 150);
		this.gt.println("");

		this.gt.println("");
		this.gt.addButton("Add beer", this, "addRecord");
		this.gt.addButton("More Info", this, "moreInfo");
		this.gt.addButton("Close", this, "close");

		

		while (beerNumberMax.isEmpty()) {
			this.beerNumberMax = gt.getInputString("please enter number of inputs");
		}

		if (beerNumberMax != null) {

			this.beerNumber = Integer.parseInt(this.beerNumberMax);

			this.beerNames = new String[this.beerNumber];
			this.beerScores = new char[this.beerNumber];
			this.beersStock = new int[this.beerNumber];
			this.beerCosts = new double[this.beerNumber];
			this.beersGood = new boolean[this.beerNumber];
		}

		else {
			this.gt.showErrorDialog("User has Cancelled");
		}
		
			addRecord();
		
	}

	public void addRecord() {

		
		if (this.counter < this.beerNumber) {
		
			String beerName = this.gt.getTextFromEntry(0);
			char beerScore = this.gt.getTextFromEntry(1).charAt(0);
			int beerStock = Integer.parseInt(this.gt.getTextFromEntry(2));
			double beerCost = Double.parseDouble(this.gt.getTextFromEntry(3));
			boolean beerGood = Boolean.parseBoolean(this.gt.getTextFromEntry(4));

			this.beerNames[this.counter] = beerName;
			this.beerScores[this.counter] = beerScore;
			this.beersStock[this.counter] = beerStock;
			this.beerCosts[this.counter] = beerCost;
			this.beersGood[this.counter] = beerGood;
			this.counter++;
			if (beerName.isBlank())
				beerName = this.gt.getInputString("Please enter the beers name.");

			if (Character.isAlphabetic(beerScore) == false)
				beerScore = this.gt.getInputString("Please re-enter a score from A to F").charAt(0);

			if (beerStock <= 0)
				beerStock = Integer
						.parseInt(this.gt.getInputString("Please enter how many " + beerName + " you have in stock"));

			if (beerCost <= 0)
				beerCost = Double.parseDouble(this.gt.getInputString("Please Re-enter cost of the beer."));

			if (!beerGood)
				beerGood = Boolean.parseBoolean(this.gt.getInputString(
						"If you haven't Drank the beer what are you rating is. Please enter true to continue"));
			else {
				this.gt.showMessageDialog("Input added");
			}
			/*
			 * this.beerNames[this.counter] = this.beerName; this.beerScores[this.counter] =
			 * this.beerScore; this.beersStock[this.counter] = this.beerStock;
			 * this.beerCosts[this.counter] = this.beerCost; this.beersGood[this.counter] =
			 * this.beerGood;
			 */
			this.sumC += this.beerCosts[this.counter];

			if (this.beersStock[this.counter] < this.beersStock[this.minArrayIndex])
				this.minArrayIndex = this.counter;

		
			refreshTable();

		}
		if (this.counter == this.beerNumber)
			this.gt.showWarningDialog(this.beerNumber + "  Entries Reached");
	}

	public void refreshTable() {
		this.gt.clearRowsOfTable(0);

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

		this.costAverage = this.sumC / this.beerNumber;
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
