public class PLayAround {
	
public static void main (String[]args) {

		GTerm gt = new GTerm (500,500);
		
		int b = 5;
	
		int a = Integer.parseInt(gt.getInputString("Enter a numerical Value lower than 5"));
		
		
		
	if (a <= b) { 
		gt.showMessageDialog(gt.addImageIcon("Cat.jpg"));
		
	}
	else { 
		gt.showMessageDialog("Wrong");
	}
	
	}
}