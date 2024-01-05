package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class AccountDeposit extends Account {

	public AccountDeposit(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
		super(id, accountType, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}

}
