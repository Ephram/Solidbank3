package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.enums.OperationType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;
import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionRepository;

@Component
public class TransactionWithdraw {
	@Autowired
	private AccountWithdrawService accountWithdrawService;
	@Autowired
	private TransactionRepository repository;

	public void execute(Account account, double amount) {
		if (accountWithdrawService.withdraw(amount, account)) {
			repository.save(new Transaction(account, amount, OperationType.WITHDRAW));
		}

	}

}
