package homeExercise;

public class Exercise13BranchCaller {
	
	public static void main(String args[]) {
		
		Exercise13Branch branch1 = new Exercise13Branch("22 Main Street", 32, 500, "MWF");
		Exercise13Branch branch2 = new Exercise13Branch("732 Evergreen Terrace", 8, 4300, "MWTF");
		Exercise13Branch branch3 = new Exercise13Branch("4 Park Road", 14, 2100,"TWTF");
		
		printProp(branch1);
		printProp(branch2);
		printProp(branch3);				
	}
	
	public static void printProp(Exercise13Branch bran) {
		System.out.println("Bank Name: "+bran.getBankName());
		System.out.println("Bank Address: "+bran.getAddress());
		System.out.println("Total Employees: "+bran.getTotalEmployees());
		System.out.println("Timing: "+bran.getTiming());						
		System.out.println("******************************************************");
	}
}
