package lti.bank;

import java.util.Vector;

/**
	 * this class represents generelised bank account
	 * @author AE206_PC14
	 * @version 1.0
	 *
	 */

	public abstract class Account implements Bank {
		private int acntNo;
		private String Holder;
		protected double balance;

		private static int autogen = INIT_ACCT_NO;
		
		protected Transcation[] txns;
		Vector<Transcation> obj = new Vector<Transcation>();
		protected int idx;

		public Account() {

		}

		public Account(String holder, double balance) {
			this.acntNo = autogen++;
			Holder = holder;
			this.balance = balance;
			// transaction instaiating
			
			//Vector obj = new Vector();
			
			//txns = new Transcation[10];
			
			
			
			// addding new account
			 
			obj.add(idx++ , new Transcation("Minimum bal \t", balance, balance));

		}

		public double getBalance() {
			return balance;
		}

		public void summary() {
			System.out.println("accno:" + acntNo);
			System.out.println("holder:" + Holder);
			System.out.println("balance:" + balance);
		}

		public void deposit(double amount) {
			balance += amount;
			obj.add(idx++, new Transcation("cr", amount, balance));
			//txns[idx++] = new Transcation("cr", amount, balance);
		}

		abstract public void withdraw(double amount);

		public void statement() {
			System.out.println("statement of a/c:" + acntNo);
			for (int i = 0; i < idx; i++)
				System.out.println(obj.get(i));
		}

	}

