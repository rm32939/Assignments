package inherit;

public class AccountTest {
	
	public static void Showbalance(Account ac) {
		System.out.println(ac.getBalance());
	}

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Amrit",123,100000);
		System.out.println(sa);
		sa.withdraw(200000);
		System.out.println(sa);
		CurrentAccount ca = new CurrentAccount("Ashish",456,50000);
		System.out.println(ca);
		ca.withdraw(200000);
		System.out.println(ca);
		
		//polymorphism(Dynamic invocation): any instance of the sub type can be assigned to the super type.
		Account ac = new SavingsAccount("Suchi", 678, 1200000);
		ac.withdraw(200000);
		System.out.println(ac);
		
		System.out.println("----------------");
		Showbalance(ac);
		System.out.println("-----------------");
		Showbalance(sa);
		ac.print("hello account");
		printAccount(ac, new ConsolePrinter());
		printAccount(ac, new FilePrinter());
		//whenever we find a super type any instance from the sub type can be passed. 
	}
	
	public static void printAccount(Account ac, Printer p) {
		
		ac.print("from accounts");
		p.print("From printer class");
	}

}
