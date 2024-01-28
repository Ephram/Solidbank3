package kz.dulatibrayev.solidbankapp.services.interfaces;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;

@Component
public interface AccountDepositService {
	boolean deposit(double amount, Account account);

}
