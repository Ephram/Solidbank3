package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.CheckingAccount;
import kz.dulatibrayev.solidbankapp.account.FixedAccount;
import kz.dulatibrayev.solidbankapp.account.SavingAccount;
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

		switch (accountType) {
		case CHECKING:
			repository.save(new CheckingAccount(accountType, String.valueOf(accountID), clientID, 0.0, true));
			break;

		case SAVING:
			repository.save(new SavingAccount(accountType, String.valueOf(accountID), clientID, 0.0, true));

			break;
		case FIXED:
			repository.save(new FixedAccount(accountType, String.valueOf(accountID), clientID, 0.0, false));
			break;
		default:
			System.out.println("wrong input");
			break;
		}

//		switch (accountType) {
//		case CHECKING:
//			accountDAO
//					.createNewAccount(new CheckingAccount(accountType, String.valueOf(accountID), clientID, 0.0, true));
//
//			break;
//		case SAVING:
//			accountDAO.createNewAccount(new SavingAccount(accountType, String.valueOf(accountID), clientID, 0.0, true));
//
//			break;
//		case FIXED:
//			accountDAO.createNewAccount(new FixedAccount(accountType, String.valueOf(accountID), clientID, 0.0, false));
//
//			break;
//		default:
//			System.out.println("wrong input");
//			break;
//		}

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
