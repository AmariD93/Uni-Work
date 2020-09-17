public class ifElseHaveAGoodTime {
	public static void main(String[] args) {
		GTerm gt = new GTerm(500, 200);

		String rawInput = gt.getInputString(
				"Please enter the following: First Name, Gender, Age, Month and year of birth using a period, You are enjoying this course?");

		String[] fieldsOfStudent = rawInput.split(",");

		String firstName = fieldsOfStudent[1];
		char gender = fieldsOfStudent[2].charAt(0);
		int age = Integer.parseInt(fieldsOfStudent[3]);
		double monthYearBirth = Double.parseDouble(fieldsOfStudent[4]);
		boolean loveIt = Boolean.parseBoolean(fieldsOfStudent[5]);

		
		
		gt.println(firstName , gender , age , monthYearBirth, loveIt);
		

		gt.showHelp();
	}
}