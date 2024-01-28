package kz.dulatibrayev.solidbankapp.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Component
public class TransactionWithdrawCLI {
	@Autowired
	private TransactionWithdraw transactionWithdraw;
	@Autowired
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	@Autowired
	private AccountListingService accountListingService;

	public void withdrawMoney(Long id) {
		String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();

		Account account = accountListingService.getClientWithdrawAccount(id, accountID);

		if (account == null || (account.isWithdrawAllowed() == false)) {
			System.out.println("There is no account to make withdraw");

		} else {
			double withdrawAmountMoney = withdrawDepositOperationCLIUI.requestClientAmount();

			transactionWithdraw.execute(account, withdrawAmountMoney);
		}

	}

}
