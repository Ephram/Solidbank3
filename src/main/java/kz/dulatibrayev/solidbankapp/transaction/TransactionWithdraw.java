package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;

@Component
public class TransactionWithdraw {
	@Autowired
	private AccountWithdrawService accountWithdrawService;

	public void execute(Account account, double amount) {
		accountWithdrawService.withdraw(amount, account);
		//transactionDAO.addTransaction(new Transaction());
	}

}
