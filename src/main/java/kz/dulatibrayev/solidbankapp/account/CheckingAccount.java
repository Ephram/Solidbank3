package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class CheckingAccount extends AccountWithdraw {

	public CheckingAccount(long id, AccountType accountType, String clientID, double balance, boolean withdrawAllowed) {
		super(id, accountType, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}
	

}
