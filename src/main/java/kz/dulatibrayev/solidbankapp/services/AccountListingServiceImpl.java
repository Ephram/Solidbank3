package kz.dulatibrayev.solidbankapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountListingServiceImpl implements AccountListingService {
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public Account getClientAccount(String clientID, String accountID) {
		return accountDAO.getClientAccount(clientID, accountID);
		

	}

	@Override
	public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
		return accountDAO.getClientWithdrawAccount(clientID, accountID);

	}

	@Override
	public List<Account> getClientAccounts(String clientID) {
		return this.accountDAO.getClientAccounts(clientID);

	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		
		return null;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
