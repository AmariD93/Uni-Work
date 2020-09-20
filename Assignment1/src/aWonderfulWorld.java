import java.awt.Color;

public class aWonderfulWorld {
	public static void main(String[] args) {
		GTerm gt = new GTerm(700, 500);

		/*Setting style and font color to String "greeting"
		 */
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		// Print line String greeting
		String greeting = "Hello there traveller!" + "\n" + 		
				"I need your help!" + "\n" + "Please will you tell me your name?";	
		gt.println (greeting);
		
		//Set a dialog box so that text can be seen clearly
		gt.setXY(80, 200);
		gt.addImageIcon("lib/dialogBox.png");
		
		// Setting XY for guide "frog.png
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		//setXY for background image
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
	
		//Create string to be defined by used input. As it is a name, an undefined amount of charcters and symbols 
		//a String is the only option
		String playerName;
		playerName = gt.getInputString("What was your name?");
		
		//This Code Block is used to refresh the page to display a new output,
		// which uses the players input to greet them in playerName
		{
			gt.clear();
	
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		gt.println(playerName + "! What a great name!" + "\n" + "Can you help me save the princess?");
	
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
		
		String pleaseHelp = gt.getInputString("Will you help me?");
		pleaseHelp = pleaseHelp.trim().toLowerCase();

		
		
		//This code block is not checking for a Boolean variable from the the input the user gives us
		// the output will be using an if else statement to determine the output message
		
		gt.clear();
		
	if (pleaseHelp.equals("yes"))
	{   
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		gt.println("I'm so happy that you can help me.");
		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
	}
	
	else if (pleaseHelp.equals("no"))
	{ 
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
		
		gt.println("It will really help the kingdom." + "\n" + "are you sure?");
		pleaseHelp = gt.getInputString("Will you help us?");
		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
	}
	 else 
		 gt.clear();
		gt.setXY(100,200);
		gt.setFontSize(25);
		gt.setFontColor(Color.white);
	
		pleaseHelp = gt.getInputString("Try Again");
		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
	}
		
		
		gt.setXY(80, 190);
		gt.addImageIcon("lib/dialogBox.png");
		
		gt.setXY(230,340);
		gt.addImageIcon("lib/Frog.png");
		
		gt.setXY(0, 0);
		gt.addImageIcon("lib/woods.jpg");
		
		
		
		// gt.showHelp();
	}
}
