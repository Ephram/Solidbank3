package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class TransactionDepositCLI {
	@Autowired
	private TransactionDeposit transactionDeposit;
	@Autowired
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	@Autowired
	private AccountListingService accountListingService;

	public void depositMoney(String clientID) {
		String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
		
		
		AccountDeposit accountDeposit = (AccountDeposit) accountListingService.getClientAccount(clientID, accountID);

		
		double depositMoney = withdrawDepositOperationCLIUI.requestClientAmount();

		transactionDeposit.execute(accountDeposit, depositMoney);

	}

}
