package bank.lti;




public class Test1 {
	public static void main(String[] args) {
		// Account a=new Account("polo",5000);
		// a.summary();
		//
		// a.deposit(5000);
		// System.out.println(a.getBalance());
		//
		// a.withdraw(1000);
		// System.out.println(a.getBalance());
		//
		// a.withdraw(10000);

		// Savings sa=new Savings("polo");
		// sa.summary();
		//
		// sa.withdraw(1000);
		//
		// Account c=new Savings("polo");

		// Bank c=new Savings("polo");
		Bank c = AccountFactory.openAccount("current", "polo");
		c.summary();

		//c.deposit(2000);

		c.deposit(2000);
		c.withdraw(8000);
		c.deposit(8000);
		c.withdraw(6000);
		c.deposit(5000);
		c.withdraw(2000);
		c.deposit(6000);
		c.withdraw(4000);
		c.deposit(4000);
		c.withdraw(8000);
		c.withdraw(1000);
		c.withdraw(10000);
		c.deposit(2000);
		c.withdraw(8000);
		c.deposit(8000);
		c.withdraw(6000);
		c.deposit(5000);
		c.withdraw(2000);
		c.deposit(6000);
		c.withdraw(4000);
		c.deposit(4000);
		c.withdraw(8000);
		c.withdraw(1000);
		c.withdraw(10000);
		c.statement();

		// c.withdraw(2000);
		//
		// c.summary();
		//
		// c.withdraw(7000);
		// c.summary();
		//
		// c.withdraw(20000);

		// c.deposit(1000);
		// c.summary();
	}
}


