package kz.dulatibrayev.solidbankapp.services.interfaces;

import java.util.List;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

public interface AccountListingService {
	
	
	Account getClientAccount(Long clientID, String accountID);
	
	Account getClientWithdrawAccount(Long id, String accountID);
	
	
	List<Account> getClientAccounts(String clientID);

	List<Account> getClientAccountsByType(String clientID, AccountType accountType);

	



}
