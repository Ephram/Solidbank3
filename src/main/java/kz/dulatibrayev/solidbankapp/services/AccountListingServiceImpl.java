package kz.dulatibrayev.solidbankapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Service
public class AccountListingServiceImpl implements AccountListingService {
	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private AccountRepository repository;

	@Override
	public Account getClientAccount(Long id, String accountID) {

		return repository.findById(Long.valueOf(accountID)).get();
	}

	@Override
	public Account getClientWithdrawAccount(Long id, String accountID) {

		return repository.findById(Long.valueOf(accountID)).get();
	}

	@Override
	public List<Account> getClientAccounts(String clientID) {

		return repository.findAllByClientID(clientID);

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
