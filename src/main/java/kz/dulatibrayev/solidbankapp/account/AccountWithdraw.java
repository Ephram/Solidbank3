package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class AccountWithdraw extends AccountDeposit {

	public AccountWithdraw(long id, AccountType accountType, String clientID, double balance, boolean withdrawAllowed) {
		super(id, accountType, clientID, balance, withdrawAllowed);
	}

}
