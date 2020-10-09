public class PleaseRenameMe {
	public static void main(String[] args) {
		GTerm gt = new GTerm(500, 200);
		
		double result;
		int jenisVariable = Integer.parseInt(gt.getInputString("Enter number"));
		double jenisDouble = Double.parseDouble(gt.getInputString("Enter a decimal value"));
		double guess = Double.parseDouble(gt.getInputString("What do you this the result is?"));
		result = jenisVariable * jenisDouble;
		
		if (guess == result) {
			gt.println("thats right");
				}
		else  {
			gt.println("Thats wrong");
		
		}
		result = jenisVariable * jenisDouble;
		


		
	}
}