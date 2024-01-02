package kz.dulatibrayev.solidbankapp.app;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountCreationService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankCore {
	private static long id = 1;
	private long lastAccountNumber = 1;
	@Autowired
	private AccountCreationService accountCreation;

	public void createNewAccount(AccountType accountType, String clientID) {
		accountCreation.create(accountType, Long.toString(id), clientID, lastAccountNumber);
		
		System.out.println(accountType.toString() + " account created");
		incrementLastAccountNumber();
	}

	public void incrementLastAccountNumber() {
		this.lastAccountNumber++;

	}

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		BankCore.id = id;
	}

	public long getLastAccountNumber() {
		return lastAccountNumber;
	}

	public void setLastAccountNumber(long lastAccountNumber) {
		this.lastAccountNumber = lastAccountNumber;
	}

	public AccountCreationService getAccountCreation() {
		return accountCreation;
	}

	public void setAccountCreation(AccountCreationService accountCreation) {
		this.accountCreation = accountCreation;
	}

}
