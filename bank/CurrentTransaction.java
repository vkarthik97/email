package lti.bank;

public class CurrentTransaction extends Transcation {
	private double od;

	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, double od) {
		super(type, amount, balance);
		this.od = od;
	}

	@Override
	public String toString() {
		return super.toString()+od;
	}

}
