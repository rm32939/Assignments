package inherit;

public class SavingsAccount extends Account {
	
	private static final double MINIMUM=10000;

	public SavingsAccount(String name, int number, double balance) {
		super(name, number, balance);
		System.out.println("Savings");

	}
	
	@Override
	public void withdraw(double amount) {
		
		if(balance-amount>=MINIMUM) {
	
			balance-=amount;
		}
			
	}

}
