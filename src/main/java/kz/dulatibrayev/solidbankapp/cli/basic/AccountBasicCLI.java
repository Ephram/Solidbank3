package kz.dulatibrayev.solidbankapp.cli.basic;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.app.BankCore;
import kz.dulatibrayev.solidbankapp.cli.interfaces.CreateAccountOperationUI;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountBasicCLI {
	@Autowired
	private CreateAccountOperationUI createAccountOperationUI;
	@Autowired
	private BankCore bankCore;
	@Autowired
	private AccountListingService accountListing;

	public void createAccountRequest(String clientID) {
		AccountType accountType = this.createAccountOperationUI.requestAccountType();
		if (accountType != null) {
			this.bankCore.createNewAccount(accountType, clientID);

		}

	}

	public void getAccounts(String clientID) {
		System.out.println(this.accountListing.getClientAccounts(clientID));

	}

}
