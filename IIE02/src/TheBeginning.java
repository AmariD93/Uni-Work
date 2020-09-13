public class TheBeginning {
	public static void main(String[] args) {
		GTerm gt = new GTerm(500, 200);

		// --String--

		// I chose to us name as it's keeping it simple in terms of this program. I
		// don't have to referance a list of different variables to know what prints
		// name
		String name;// Initialising
		name = "Daniel";// Giving it text Value
		gt.println("Hey there " + name + " How are you?"); // Return message greeting

		// --Integer--

		// I have chosen beerAmount as the integer as it is a quick description of which
		// of the "beer" based variables pertaining to amount of beers drank
		int beerAmount;
		beerAmount = 5;
		beerAmount++;
		gt.println("You've had " + beerAmount + " beers tonight!");

		// --Double--

		// I have two instances of double here for a bit of a change in formating and
		/* output
		 * Again the names are simple to stop confusing between individual beer cost and
		 * overall cost
		 */
		double beerCost;
		double totalCost;
		beerCost = 7.55;
		totalCost = beerAmount * beerCost;
		gt.println("It has costed you " + "$" + beerCost + " for each beer and " + "$" + totalCost + " for the night");

		// --Char--

		// The program is going to auto assign you a nickname based off off the first
		// letter of your name, using the variable nickName
		char nickName;
		nickName = name.charAt(0);
		gt.println("I am going to call you " + nickName + " Is that ok?");

		// --Boolean-- hey

		// A simple yes or no question, I named it isThatOk because it makes you think
		// yes or no which makes me think of a boolean
		boolean isThatOk;
		isThatOk = false;
		gt.println("You have had enough don't you think? " + isThatOk);

		
		

		
		
		// gt.showHelp();
	}
}
