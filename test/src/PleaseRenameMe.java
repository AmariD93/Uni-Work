public class PleaseRenameMe {
	public static void main(String[] args) {
		int [] marks; // continuous manner- declaring an array
		GTerm gt = new GTerm(500, 200);
		
		gt.println("How many subjects & marks you want to entter");
		int n=Integer.parseInt(gt.getInputString(""));
		marks=new int [n];// space reserved in memory for n integers
		char [] subjects=new char[n];//declaring and initializing
		for (int i=0;i<subjects.length;i++) // initialize counter; termination condition; increment/decrement of counter
		{
		gt.println("Enter the subject code " + (i+1));
		subjects[i]=gt.getInputString("").charAt(0);
		gt.println("Enter the marks for subject "+ subjects[i]);
		marks[i]=Integer.parseInt(gt.getInputString(""));
		}
		gt.println("The length of subjects array is "+subjects.length);
		gt.println("Subjects" + "\t" + "Marks" );
		int j=0;
		while(j<subjects.length)
		{
			gt.println(subjects[j]+"\t\t"+marks[j]);
			j++;
		}
		
		
	}
}