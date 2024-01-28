package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Component
public class TransactionDepositCLI {

	@Autowired
	private TransactionDeposit transactionDeposit;
	@Autowired
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	@Autowired
	private AccountListingService accountListingService;

	public void depositMoney(Long id) {
		String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();

		Account account = accountListingService.getClientAccount(id, accountID);

		double depositMoney = withdrawDepositOperationCLIUI.requestClientAmount();

		transactionDeposit.execute(account, depositMoney);

	}

}
