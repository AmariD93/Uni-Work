import java.awt.Color;
import java.util.Arrays;

public class BeerTracker {

	private GTerm gt;
	// Initialize max record and loop counters
	private String temprecordNumber;
	private int recordNumber;
	private int x;

	// Initialize Text Field Variable
	private int namesTextField;
	private int ratingTextField;
	private int unitTextField;
	private int costTextField;
	private int stockTextField;

	// Initialize Table Headers
	private String columnNames;

	// Initialize Arrays
	private String[] beerNames;
	private char[] beerRating;
	private int[] beerUnit;
	private double[] beerCost;
	private boolean[] beerStock;

	// Intialize temporary containers
	private String tempbeerNames;
	private char tempbeerRating;
	private int tempbeerUnit;
	private double tempbeerCost;
	private boolean tempbeerStock;

	// Initialize Input data for addRowToTable
	private String inputData;

	// Creating GUI
	public BeerTracker() {
		
		this.x = 0;

		this.gt = new GTerm(700, 410);

		columnNames = "Beer Name\t Rating\t Stock\t Cost\t Index";

		this.gt.setBackgroundColor(Color.white);
		this.gt.setFontColor(Color.BLACK);

		this.gt.addTable(400, 400, columnNames);

		this.gt.setXY(420, 0);
		this.gt.println("Beer Name");
		this.namesTextField = this.gt.addTextField("", 150);

		this.gt.println("");
		this.gt.println("Rating");
		this.ratingTextField = this.gt.addTextField("", 150);
		this.gt.println("");

		this.gt.println("Stock");
		this.ratingTextField = this.gt.addTextField("", 150);
		this.gt.println("");

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

		this.temprecordNumber = this.gt.getInputString("How many Records do you want to create?");
		
		this.recordNumber = Integer.parseInt(this.temprecordNumber);
		
		if (this.temprecordNumber != null) {
		this.beerNames = new String[this.recordNumber];
		this.beerRating = new char[this.recordNumber];
		this.beerUnit = new int[this.recordNumber];
		this.beerCost = new double[this.recordNumber];
		this.beerStock = new boolean[this.recordNumber];
		}
		addRecord();

	}

	public void addRecord() {

		while (this.x < this.recordNumber) {

			this.tempbeerNames = this.gt.getTextFromEntry(this.namesTextField);
			this.tempbeerRating = this.gt.getTextFromEntry(this.ratingTextField).charAt(0);
			this.tempbeerUnit = this.unitTextField;
			this.tempbeerCost = Double.parseDouble(gt.getTextFromEntry(this.costTextField));
			this.tempbeerStock = Boolean.parseBoolean(this.gt.getTextFromEntry(this.stockTextField));

			this.beerNames[this.x] = this.tempbeerNames;
			this.beerRating[this.x] = this.tempbeerRating;
			this.beerUnit[this.x] = this.tempbeerUnit;
			this.beerCost[this.x] = this.tempbeerCost;
			this.beerStock[this.x] = this.tempbeerStock;

			this.inputData = this.beerNames[this.x] + "\t" + this.beerRating[this.x] + "\t" + this.beerUnit[this.x]
					+ "\t" + this.beerCost[this.x] + "\t" + this.beerStock[this.x] + "\t" + (this.x + 1);
			
			refreshTable();
		}
		this.x++;
		

	}

	public void refreshTable() {
		this.gt.clearRowsOfTable(0);
		int j = 0;
		while (j < this.recordNumber) {
			this.gt.addRowToTable(0, inputData);

		}
		j++;
	}

	public void clearTextField() {

	}

	public void moreInfo() {

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
