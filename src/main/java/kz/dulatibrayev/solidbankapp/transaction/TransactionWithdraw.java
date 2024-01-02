package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;
import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionDAO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionWithdraw {
	@Autowired
	private AccountWithdrawService accountWithdrawService;
	@Autowired
	private TransactionDAO transactionDAO;

	public void execute(AccountWithdraw accountWithdraw, double amount) {
		accountWithdrawService.withdraw(amount, accountWithdraw);
		transactionDAO.addTransaction(new Transaction());
	}

}
