package homeExercise;

public class Exercise13Branch extends Exercise13Bank {

	private String timing;
	private double balance;
	
	public Exercise13Branch(String bankAddress, int totalEmployees, double balance,String timing) {
		super(bankAddress, totalEmployees, balance);
		this.timing = timing;
	}

	public Exercise13Branch() {}

	@Override
	public double withdrawMoney(double y) {
		System.out.println("Made withdrawl from Branch. New balance: "+(this.getBalance()-y));
		return this.getBalance() - y;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}
}