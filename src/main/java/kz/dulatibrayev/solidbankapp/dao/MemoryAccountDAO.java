package kz.dulatibrayev.solidbankapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

@Component
public class MemoryAccountDAO implements AccountDAO {

	private List<Account> accountList = new ArrayList<Account>();

	@Override
	public List<Account> getClientAccounts(String clientID) {
		return this.accountList;
	}

	@Override
	public void createNewAccount(Account account) {
		accountList.add(account);
	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		return null;
	}

	@Override
	public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
		for (Account account : accountList) {
			if (account.getId() == Long.valueOf(accountID)) {
				if (account.isWithdrawAllowed()) {
					return (AccountWithdraw) account;
				}
			}
		}
		return null;
	}

	@Override
	public Account getClientAccount(String clientID, String accountID) {
		for (Account account : accountList) {
			if (account.getId() == Long.valueOf(accountID)) {
				return account;
			}
		}
		return null;
	}

}
