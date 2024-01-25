package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.repository.AccountRepository;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;

public class AccountDepositServiceImpl implements AccountDepositService {
	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private AccountRepository repository;

	@Override
	public void deposit(double amount, AccountDeposit account) {

		double tempBalance = account.getBalance() + amount;
		account.setBalance(tempBalance);
		System.out.println("Balance deposit success " + amount);
		repository.save(account);

	}

}
