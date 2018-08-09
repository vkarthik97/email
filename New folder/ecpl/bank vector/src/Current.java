package lti.bank;


	

	public class Current extends Account {
		private double overdraft;

		public Current() {
		}

		public Current(String holder) {
			super(holder, INIT_CUR_BAL);
			this.overdraft=10000;
		}

		@Override
		public void withdraw(double amount) {
			// super.withdraw(amount);

			if (amount <= balance) {
				balance -= amount;
				
				obj.add(idx++,new CurrentTransaction("debited \t", amount, balance,overdraft));
				//txns[idx++] = new CurrentTransaction("debited \t", amount, balance,overdraft);

			} 
			else if (amount > balance)
			{
				if ((amount - balance) > OVERDRAFT_AMT)
					System.out.println("isufficient funds");
				
				else 
				{
					overdraft = overdraft - (amount - balance);
					balance = MIN_CUR_BAL;
					System.out.println("overdraft:" + overdraft);
					//txns[idx++] = new CurrentTransaction("debited \t", amount, balance,overdraft);

				}
			}
			 else if (amount > (balance + overdraft))
				System.out.println("insufficient funds");
	
		}

		@Override
		public void deposit(double amount) {
			if(balance<=MIN_CUR_BAL)
			{
				if(amount>=(overdraft-10000)){
					balance = amount - (overdraft-10000);
					overdraft=10000;
				}
				else{
					overdraft=overdraft+amount;
					balance=0;
				}
			}
			else if(balance>MIN_CUR_BAL)
			{	balance+=amount;}
			obj.add(idx++,new CurrentTransaction("credited \t", amount, balance,overdraft));
			//txns[idx++] = new CurrentTransaction("credited \t", amount, balance,overdraft);

		}

	}


