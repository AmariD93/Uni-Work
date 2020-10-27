import java.awt.Color;


public class BeerTracker {

	private GTerm gt;
	
	private String columnNames;
	private int maxBeerNumber;
	private String[] beerNames;
	private int currentBeerNumber;
	 
	 
	 
	public  BeerTracker() {
		this.gt = new GTerm(700, 410);
		this.maxBeerNumber = 0;
		this.maxBeerNumber = Integer.parseInt(this.gt.getInputString("How many records do you want?"));
		this.currentBeerNumber = 0;
		this.beerNames = new String[this.maxBeerNumber];

		this.columnNames = "Beer Name\t Rating\t Stock\t Cost\t Index";
		this.gt.addTable(400, 400, columnNames);
		this.gt.addButton("Add Beer", this, "addRecord");
		this.gt.addTextField("", 100);
		
		addRecord();
	
		
	}

	public void addRecord(){
		
		while(this.currentBeerNumber < this.maxBeerNumber) {
			this.beerNames[this.currentBeerNumber] = this.gt.getTextFromEntry(0);
			this.currentBeerNumber ++;
		}
		refreshTable();
		}

	

	public void refreshTable() {
		int i =0;
		this.gt.clearRowsOfTable(0);
		while(i <this.maxBeerNumber) {
			this.gt.addRowToTable(0, this.beerNames[i]);
			i ++;
	}
		
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
