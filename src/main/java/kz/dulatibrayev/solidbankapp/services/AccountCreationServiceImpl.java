package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountCreationService;

@Component
public class AccountCreationServiceImpl implements AccountCreationService {
	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private AccountRepository repository;

	@Override
	public void create(AccountType accountType, String bankID, String clientID, long accountID) {

		Account account = new Account();

		account.setAccountType(accountType);
		account.setClientID(clientID);
		account.setBalance(0.0);
		account.setWithdrawAllowed(true);

		repository.save(account);

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
