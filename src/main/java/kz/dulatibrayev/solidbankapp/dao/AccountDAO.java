package kz.dulatibrayev.solidbankapp.dao;

import java.util.List;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

public interface AccountDAO {
	List<Account> getClientAccounts(String clientID);

	void createNewAccount(Account account);

	void updateAccount(Account account);

	List<Account> getClientAccountsByType(String clientID, AccountType accountType);

	AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

	Account getClientAccount(String clientID, String accountID);

}
