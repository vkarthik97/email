package lti.bank;

	

	public interface Bank {
		void summary();
		double getBalance();
		
		void deposit(double amount);
		void withdraw(double amount);
		
		void statement();
		
		int INIT_ACCT_NO=1001;
		double MIN_SAV_BAL=1000;
		double INIT_CUR_BAL=5000;
		double MIN_CUR_BAL=0;
		
		double OVERDRAFT_AMT=10000;

	}


