package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Component
public class TransactionWithdrawCLI {

	private TransactionWithdraw transactionWithdraw;

	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;

	private AccountListingService accountListingService;

	public void withdrawMoney(String clientID) {
		String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();

		AccountWithdraw accountWithdraw = accountListingService.getClientWithdrawAccount(clientID, accountID);

		if (accountWithdraw == null) {
			System.out.println("Chosen account is not allowed to withdraw money");

		} else {
			double withdrawAmountMoney = withdrawDepositOperationCLIUI.requestClientAmount();

			transactionWithdraw.execute(accountWithdraw, withdrawAmountMoney);
		}

	}

}
