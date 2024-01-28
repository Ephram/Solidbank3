package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

		try {

			AccountDeposit accountDeposit = (AccountDeposit) accountListingService.getClientAccount(clientID,
					accountID);

			double depositMoney = withdrawDepositOperationCLIUI.requestClientAmount();

			transactionDeposit.execute(accountDeposit, depositMoney);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
