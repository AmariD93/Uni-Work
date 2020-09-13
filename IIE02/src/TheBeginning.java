public class TheBeginning {
	public static void main(String[] args) {
		GTerm gt = new GTerm(500, 200);

		/*--String--
		 *  I chose to use String variable (userName) as it keeps it simple,
		 * The user Will be entering their names to return an output. keeping variable
		 * name simple in a smaller program helps ease of use
		 */
		String userName;
		userName = "Daniel";
		gt.println("Hey there  " + userName + " How are you?");

		/*--Integer--
		 * I have chosen beerUnit as it stick to simplicity, It has a quick
		 * description of which of the "beer" functions need to referenced.
		 */
		int beerUnit;
		beerUnit = 5;
		gt.println("You've had " + beerUnit + " beers tonight!");

		/*--Double--
		 * I have two instances of double here for a bit of a change in format and output. Again as 
		 * it is in relation to a similar variable name I have add descriptives to help identify them
		 */

		double beerCost;
		double totalCost;
		beerCost = 7.55;
		totalCost = beerUnit * beerCost;
		gt.println("It has costed you " + "$" + totalCost + " for the night.");

		/*--Char--
		 * I have set the program to auto assign a nickname based on the users input. 
		 * This is done using charAt to extract the first letter of the input.
		 * Again keeping the variable name simple to avoid confusion
		 */

		char nickName;
		nickName = userName.charAt(0);
		gt.println("Do you mind if i call you " + nickName + " Dawg?");

		/*--Boolean--
		 * I named it isThatOk because it makes you think yes(true) or no(false) which is a boolean output
		 */
		boolean isThatOk;
		isThatOk = false;
		gt.println("Do you think you've had enough?" + isThatOk);

		// gt.showHelp();
	}
}
