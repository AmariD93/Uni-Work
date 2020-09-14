
public class firstShot {
    public static void main (String[] args) {
    	GTerm gt = new GTerm(600,600);
		int currentYear=2020;
		int birthYear= 1993;
		int yourAge= currentYear-birthYear;
		gt.print("This is your age: ");
		gt.setFontSize(25);
		gt.print(""+yourAge);
				
				
    }
}