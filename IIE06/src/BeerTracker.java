import java.awt.Color;
import java.util.Arrays;

public class BeerTracker {
	// Test input : VB, A, 5, 4.55, true

	private GTerm gt;

	// Setting input loops
	private String beerNumberMax;
	private int beerNumber;

	// Variable containers for user input
	private String[] beerName;
	private char[] beerScore;
	private int[] beerStock;
	private double[] beerCost;
	private boolean[] beerGood;
	
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
	
	private int textField0;
	private int textField1;
	private int textField2;
	private int textField3;
	private int textField4;
	
	

	public BeerTracker() {

		this.gt = new GTerm(406, 600);
		this.gt.setBackgroundColor(Color.white);
		this.gt.setFontStyle(5);
		this.gt.setFontColor(Color.black);
		this.gt.setFontSize(18);
		this.beerNumber= 0;
		this.j = 0;
		this.minArrayIndex = 0;
		this.sumC = 0;
		this.counter = 0;

		gt.addTable(400, 300, "Beer name\tRating\tStock\tCost\tIndex");
		this.gt.println("");
		textField0 = this.gt.addTextField("", 100);
		this.gt.println("Name of Beer");
		textField1 = this.gt.addTextField("", 100);
		this.gt.println("Beer's Rating");
		textField2 = this.gt.addTextField("", 100);
		this.gt.println("Units in Stock");
		textField3 = this.gt.addTextField("", 100);
		this.gt.println("Cost per Beer");
		textField4 = this.gt.addTextField("", 100);
		this.gt.println("Do you stock it?");
		
		this.gt.addButton("Add", this, "addRecord");
		this.gt.addButton("More info", this, "moreInfo");
		this.gt.addButton("Close", this, "close");
		this.gt.println("");

		

		this.beerNumberMax = (gt.getInputString("How many beers do you want to review(Integer)?"));

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

	
		while (this.counter < this.beerNumber) {
			addRecord();
			this.counter++;
		}
	}

	public void addRecord() {


		while (this.counter < this.beerNumber) {
			this.beerName = new String[this.beerNumber];
			this.beerScore = new char[this.beerNumber];
			this.beerStock = new int[this.beerNumber];
			this.beerCost = new double[this.beerNumber];
			this.beerGood = new boolean[this.beerNumber];
			
			
			this.beerName[this.counter] = this.gt.getTextFromEntry(this.textField0);
			this.beerScore[this.counter] = this.gt.getTextFromEntry(this.textField1).charAt(0);
			this.beerStock[this.counter] = Integer.parseInt(this.gt.getTextFromEntry(this.textField2));
			this.beerCost[this.counter] = Double.parseDouble(this.gt.getTextFromEntry(this.textField3));
			this.beerGood[this.counter] = Boolean.parseBoolean(this.gt.getTextFromEntry(this.textField4));

			if (beerName[this.counter].isBlank())
				this.beerName[this.counter] = gt.getInputString("Please enter the beers name.");

			if (Character.isAlphabetic(beerScore[this.counter]) == false)
				this.beerScore[this.counter] = gt.getInputString("Please re-enter a score from A to F").charAt(0);

			if (beerStock[this.counter] <= 0)
				this.beerStock[this.counter] = Integer
						.parseInt(this.gt.getInputString("Please enter how many " + beerName + " you have in stock"));

			if (this.beerCost[this.counter] <= 0)
				this.beerCost[this.counter] = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));

			if (!beerGood[this.counter])
				this.beerGood[this.counter] = Boolean.parseBoolean(gt.getInputString(
						"You must stock it to enter. Please enter true to continue"));
			else {
				this.gt.showMessageDialog("Input added");
			}

			this.sumC += this.beerCosts[this.counter];

			if (this.beersStock[this.counter] < this.beersStock[this.minArrayIndex])
				this.minArrayIndex = this.counter;
			
			this.beerNames[this.counter] = this.beerName[this.counter];
			this.beerScores[this.counter] = this.beerScore[this.counter];
			this.beersStock[this.counter] = this.beerStock[this.counter];
			this.beerCosts[this.counter] = this.beerCost[this.counter];
			this.beersGood[this.counter] = this.beerGood[this.counter];

			this.counter++;
			refreshTable();
			clearTextField();
			

		}
		if (this.counter == this.beerNumber)
			this.gt.showWarningDialog(this.beerNumber + "  Entries Reached");
	
	}

	public void refreshTable() {
		
		this.gt.clearRowsOfTable(0);
		
		while (this.j < this.beerNumber) {
			this.gt.addRowToTable(this.j, this.beerNames[this.j] + "\t " + this.beerScores[this.j] + "\t "
					+ this.beersStock[this.j] + "\t " + "$" + this.beerCosts[this.j] + "\t" + (this.j + 1));
			this.j++;

		}

	}
	public void clearTextField() {
		this.gt.setTextInEntry(this.textField0, "");
		this.gt.setTextInEntry(this.textField1, "");
		this.gt.setTextInEntry(this.textField2, "");
		this.gt.setTextInEntry(this.textField3, "");
		this.gt.setTextInEntry(this.textField4, "");
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
