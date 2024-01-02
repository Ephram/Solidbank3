package kz.dulatibrayev.solidbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;

public class AccountWithdrawServiceImpl implements AccountWithdrawService {
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public void withdraw(double amount, AccountWithdraw account) {
		if (account.getBalance() > 0 & account.getBalance() >= amount) {
			double tempBalance = account.getBalance() - amount;
			account.setBalance(tempBalance);
			System.out.println("Balance withdraw success " + amount);
			accountDAO.updateAccount(account);
			
		} else {
			System.out.println("not enough balance");
		}

	}

}
