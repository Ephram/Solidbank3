package kz.dulatibrayev.solidbankapp.services.interfaces;

import kz.dulatibrayev.solidbankapp.account.AccountDeposit;

public interface AccountDepositService {
	void deposit(double amount, AccountDeposit account);

}
