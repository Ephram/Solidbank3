package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;

@Component
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
	@Autowired
	private AccountRepository repository;
	
	
	@Override
	public boolean withdraw(double amount, Account account) {
		if (account.getBalance() > 0 & account.getBalance() >= amount) {
			double tempBalance = account.getBalance() - amount;
			account.setBalance(tempBalance);
			System.out.println("Balance withdraw success " + amount);
			repository.save(account);
			return true;
		} else {
			System.out.println("not enough balance");
			return false;
		}

	}

}
