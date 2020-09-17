public class ifElseHaveAGoodTime {
	public static void main(String[] args) {
		GTerm gt = new GTerm(600, 400);
	
				
		
		/*
					int b = 5;
				
					int a = Integer.parseInt(gt.getInputString("Enter a numerical Value lower than 5"));
									
				if (a <= b) { 
					gt.showMessageDialog("Correct");
					
				}
				else { 
					gt.println("Wrong");
				}
				
				
		*/
		
		
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
		//gt.showHelp();
	}
}
