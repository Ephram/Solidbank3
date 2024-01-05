package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class CheckingAccount extends AccountWithdraw {

	public CheckingAccount(
			AccountType accountType, long id, String clientID, double balance,
			boolean withdrawAllowed) {
		super(accountType, id, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}
	
	

}
