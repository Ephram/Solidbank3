package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Component
public class TransactionDepositCLI {

	private TransactionDeposit transactionDeposit;
	@Autowired
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	@Autowired
	private AccountListingService accountListingService;

	public void depositMoney(String clientID) {
		String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();

		AccountDeposit accountDeposit;

		Account account = accountListingService.getClientAccount(clientID, accountID);
		if (account instanceof AccountDeposit) {
			accountDeposit = (AccountDeposit) account;
			// Proceed with deposit operations
		} else {
			// Handle the case where the account is not an AccountDeposit
			throw new IllegalStateException("Cannot deposit to a non-deposit account");
		}

		double depositMoney = withdrawDepositOperationCLIUI.requestClientAmount();

		transactionDeposit.execute(accountDeposit, depositMoney);

	}

}
