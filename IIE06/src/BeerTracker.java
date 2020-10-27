import java.awt.Color;
import java.util.Arrays;

public class BeerTracker {
	// Test input : VB, A, 5, 4.55, true

	private GTerm gt;

	// Setting input loops
	private String beerNumberMax;
	private int beerNumber;
<<<<<<< HEAD
	
=======

>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
	// Variable containers for user input
<<<<<<< HEAD

=======
	private String[] beerName;
	private char[] beerScore;
	private int[] beerStock;
	private double[] beerCost;
	private boolean[] beerGood;
	
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
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
	
	

	private int namesTextField;
	private int ratingTextField;
	private int unitTextField;
	private int costTextField;
	private int stockTextField;

<<<<<<< HEAD
	private String columnNames;

	public BeerTracker() {
		this.gt = new GTerm(406, 400);
		this.minArrayIndex = 0;
		this.sumC = 0;
		this.counter = 0;
		this.j = 0;
		this.beerNumber = 0;
		
		this.beerNumberMax = (gt.getInputString("How many beers do you want to review(Integer)?"));
		
		
=======
		this.gt = new GTerm(406, 600);
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
		this.gt.setBackgroundColor(Color.white);
		this.gt.setFontStyle(5);
		this.gt.setFontColor(Color.black);
		this.gt.setFontSize(18);
		this.beerNumber= 0;
		this.j = 0;
		this.minArrayIndex = 0;
		this.sumC = 0;
		this.counter = 0;

<<<<<<< HEAD
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
=======
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
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
		this.gt.println("");

<<<<<<< HEAD
		this.gt.println("Do you stock?");
		this.ratingTextField = this.gt.addTextField("", 150);
		this.gt.println("");

		this.gt.println("");
		this.gt.addButton("Add beer", this, "addRecord");
		this.gt.addButton("More Info", this, "moreInfo");
		this.gt.addButton("Close", this, "close");

		
=======
		

		this.beerNumberMax = (gt.getInputString("How many beers do you want to review(Integer)?"));
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git

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

<<<<<<< HEAD
		else {
			this.gt.showErrorDialog("User has Cancelled");
		}
		
			addRecord();
		
=======
	
		while (this.counter < this.beerNumber) {
			addRecord();
			this.counter++;
		}
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
	}

	public void addRecord() {

<<<<<<< HEAD
		
		if (this.counter < this.beerNumber) {
		
			String beerName = this.gt.getTextFromEntry(0);
			char beerScore = this.gt.getTextFromEntry(1).charAt(0);
			int beerStock = Integer.parseInt(this.gt.getTextFromEntry(2));
			double beerCost = Double.parseDouble(this.gt.getTextFromEntry(3));
			boolean beerGood = Boolean.parseBoolean(this.gt.getTextFromEntry(4));
=======

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
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git

<<<<<<< HEAD
			this.beerNames[this.counter] = beerName;
			this.beerScores[this.counter] = beerScore;
			this.beersStock[this.counter] = beerStock;
			this.beerCosts[this.counter] = beerCost;
			this.beersGood[this.counter] = beerGood;
			this.counter++;
			if (beerName.isBlank())
				beerName = this.gt.getInputString("Please enter the beers name.");
=======
			if (beerName[this.counter].isBlank())
				this.beerName[this.counter] = gt.getInputString("Please enter the beers name.");

			if (Character.isAlphabetic(beerScore[this.counter]) == false)
				this.beerScore[this.counter] = gt.getInputString("Please re-enter a score from A to F").charAt(0);
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git

<<<<<<< HEAD
			if (Character.isAlphabetic(beerScore) == false)
				beerScore = this.gt.getInputString("Please re-enter a score from A to F").charAt(0);

			if (beerStock <= 0)
				beerStock = Integer
=======
			if (beerStock[this.counter] <= 0)
				this.beerStock[this.counter] = Integer
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
						.parseInt(this.gt.getInputString("Please enter how many " + beerName + " you have in stock"));

<<<<<<< HEAD
			if (beerCost <= 0)
				beerCost = Double.parseDouble(this.gt.getInputString("Please Re-enter cost of the beer."));

			if (!beerGood)
				beerGood = Boolean.parseBoolean(this.gt.getInputString(
						"If you haven't Drank the beer what are you rating is. Please enter true to continue"));
=======
			if (this.beerCost[this.counter] <= 0)
				this.beerCost[this.counter] = Double.parseDouble(gt.getInputString("Please Re-enter cost of the beer."));

			if (!beerGood[this.counter])
				this.beerGood[this.counter] = Boolean.parseBoolean(gt.getInputString(
						"You must stock it to enter. Please enter true to continue"));
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
			else {
				this.gt.showMessageDialog("Input added");
			}
<<<<<<< HEAD
			/*
			 * this.beerNames[this.counter] = this.beerName; this.beerScores[this.counter] =
			 * this.beerScore; this.beersStock[this.counter] = this.beerStock;
			 * this.beerCosts[this.counter] = this.beerCost; this.beersGood[this.counter] =
			 * this.beerGood;
			 */
=======

>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
			this.sumC += this.beerCosts[this.counter];

			if (this.beersStock[this.counter] < this.beersStock[this.minArrayIndex])
				this.minArrayIndex = this.counter;
<<<<<<< HEAD
=======
			
			this.beerNames[this.counter] = this.beerName[this.counter];
			this.beerScores[this.counter] = this.beerScore[this.counter];
			this.beersStock[this.counter] = this.beerStock[this.counter];
			this.beerCosts[this.counter] = this.beerCost[this.counter];
			this.beersGood[this.counter] = this.beerGood[this.counter];
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git

		
			refreshTable();
<<<<<<< HEAD
=======
			clearTextField();
			
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git

		}
		if (this.counter == this.beerNumber)
			this.gt.showWarningDialog(this.beerNumber + "  Entries Reached");
	
	}

	public void refreshTable() {
		
		this.gt.clearRowsOfTable(0);
<<<<<<< HEAD

=======
		
>>>>>>> branch 'master' of https://github.com/AmariD93/Uni-Work.git
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
