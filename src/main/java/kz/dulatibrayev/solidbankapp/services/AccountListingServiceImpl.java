package kz.dulatibrayev.solidbankapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

@Component
public class AccountListingServiceImpl implements AccountListingService {
	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private AccountRepository repository;

	@Override
	public Account getClientAccount(String clientID, String accountID) {

		Optional<Account> opt = repository.findById(Long.valueOf(clientID));

		
		return opt.get();

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
