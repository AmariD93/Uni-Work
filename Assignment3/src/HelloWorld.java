public class HelloWorld {
	public static void main(String[] args) {
		GTerm gt = new GTerm(700, 300);
		gt.setFontSize(20);
		gt.setBackgroundColor(225,0,200);
		gt.setFontColor(225,225,225);
		gt.println("Hey! My name is Daniel.");
		gt.setFontSize(16);
		gt.setXY(69,69);
		gt.println("I love the snow and programming will get me there");
		gt.setFontSize(20);
		gt.setXY(200, 115);
		gt.println("AND");
		gt.setFontSize(16);
		gt.setXY(200,150);
		gt.println("I hope to understand how code works.");
		gt.setXY(0,200);
		gt.println("Looking forward to learning alot.");
		//gt.showHelp();
	}
}
