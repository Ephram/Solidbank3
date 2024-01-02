package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountDeposit;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService {
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public void deposit(double amount, AccountDeposit account) {

		double tempBalance = account.getBalance() + amount;
		account.setBalance(tempBalance);
		System.out.println("Balance deposit success " + amount);
		accountDAO.updateAccount(account);

	}

}
