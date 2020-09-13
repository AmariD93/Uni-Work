public class HelloWorld {
	public static void main(String[] args) {
		GTerm gt = new GTerm (600,450);
		
		//Set Greating and "Goodluck"
		gt.setFontSize(25);
		gt.setFontColor(225,0,225);
		gt.setXY(130, 0);
		gt.println("Hey! My name is Daniel.");
	
		gt.setXY(410, 410);
		gt.println("Goodluck!!!");
		
		//SetXY,Size and Color -My name is daniel balh blah blah blah
		gt.setFontSize(16);
        gt.setFontColor(0,0,0);
        gt.setXY(50, 40);
	    gt.println("My name is daniel balh blah blah blah");
	    
		//SetXY and font size -	"Enjoy this Cute Kitty"
	    gt.setFontSize(9);
	    gt.setXY(450, 310);
	    gt.println("Enjoy this cute kitty");
		
	    //SetXY	Picture of cute kitten
		gt.setXY(450,320);
		gt.addImageIcon("Cat.jpg");
			
		//Set Background Image
		gt.setXY(0, 0);
		gt.addImageIcon("Snow.jpg");
		
	
		
		//gt.showHelp();
	}
}
