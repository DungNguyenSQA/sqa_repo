package homeExercise;

public class Exercise12StaticCaller {
	
	public static void main(String args[]){
		Exercise12Static ba1 = new Exercise12Static("Robert",300);
		Exercise12Static ba2 = new Exercise12Static("James",560);
		Exercise12Static ba3 = new Exercise12Static("Jack",765);
		Exercise12Static ba4 = new Exercise12Static("Ben",245);
		Exercise12Static ba5 = new Exercise12Static("Steve",650);
		//ba1.accountNumber;
		//ba1.getAccountNumbr();
		System.out.println("Account Number for ba1 " +ba1.getAcctNumber());
		System.out.println("Account Number for ba2 " +ba2.getAcctNumber());
		System.out.println("Account Number for ba3 " +ba3.getAcctNumber());
		System.out.println("Account Number for ba4 " +ba4.getAcctNumber());
		System.out.println("Account Number for ba5 " +ba5.getAcctNumber());
	}
}
