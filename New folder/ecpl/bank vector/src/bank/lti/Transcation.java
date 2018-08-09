package bank.lti;



public class Transcation {
	private String type;
	private double amount, balance, overdraft;
	//private boolean i;

	public Transcation() {
	}

	public Transcation(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		//i = true;
	}

	// public Transcation(String type, double amount, double balance, double
	// overdraft) {
	//
	// this.type = type;
	// this.amount = amount;
	// this.balance = balance;
	// this.overdraft = overdraft;
	// i = false;
	// }

	@Override
	public String toString() {
		// if (i)
		return type + "\t " + amount + "\t" + balance + "\t";
		// else
		// return type + " " + amount + "\t" + balance + "\t" + overdraft;

	}

}
