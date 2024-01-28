package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;

@Component
public class AccountDepositServiceImpl implements AccountDepositService {
	@Autowired
	private AccountRepository repository;

	@Override
	public boolean deposit(double amount, Account account) {

		double tempBalance = account.getBalance() + amount;
		account.setBalance(tempBalance);
		System.out.println("Balance deposit success " + amount);
		repository.save(account);

		return true;

	}

}
