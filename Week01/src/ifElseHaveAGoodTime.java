public class ifElseHaveAGoodTime {
	public static void main(String[] args) {
		GTerm gt = new GTerm(600, 400);
	
				
	
		String userInput = gt.getInputString("Please enter each using a comma: First name, What is your Gender, How much do you have to spend?, How Much does each beer cost?, Do you have time?- Yes/No");
	    
		String [] studentInput = userInput.split(",");
		
		String userName = studentInput[0];
		char userGender.charAt[0] = studentInput[1];
		int userFunds = Integer.parseInt(studentInput[2]);
		double beerCost = Double.parseDouble(studentInput[3]);
		boolean doYouHaveTime = Boolean.parseBoolean (studentInput[4]);
		

		
		gt.println("Hey there " + userName);
		gt.println(""+userGender);
		gt.println(""+userFunds);
		gt.println(""+ beerCost);
		gt.println(""+ doYouHaveTime);
		
		
		/*
		int a = Integer.parseInt(gt.getInputString("select a number betw 1 and 6"));
		
	if (a == 1 ) { 
		gt.println("Correct");
		
	}if (a == 2) { 
		gt.println("you");
		
	}if (a == 3) { 
		gt.println("smell");
		
	}if (a == 4) { 
		gt.println("really");
		
	}if (a == 5) { 
		gt.println("bad");
		
	}if (a == 6) { 
		gt.println("yey");
		
	}
	*/
		//gt.showHelp();
	}
}
