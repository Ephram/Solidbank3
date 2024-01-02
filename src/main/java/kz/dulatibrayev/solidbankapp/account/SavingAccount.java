package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class SavingAccount extends AccountWithdraw {

	public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
		super(accountType, id, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}

}
