package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;
import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionDAO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionDeposit {
	@Autowired
	private AccountDepositService accountDepositService;
	@Autowired
	private TransactionDAO transactionDAO;

	public void execute(AccountDeposit accountDeposit, double amount) {

		accountDepositService.deposit(amount, accountDeposit);

		transactionDAO.addTransaction(new Transaction());
	}
}
