package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.enums.OperationType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;
import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionRepository;

@Component
public class TransactionDeposit {
	@Autowired
	private AccountDepositService accountDepositService;
	@Autowired
	private TransactionRepository transactionRepository;

	public void execute(Account account, double amount) {

		if (accountDepositService.deposit(amount, account)) {
			transactionRepository.save(new Transaction(account, amount, OperationType.DEPOSIT));
		}

	}
}
