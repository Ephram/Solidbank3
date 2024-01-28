package kz.dulatibrayev.solidbankapp.services.interfaces;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.account.Account;

@Component
public interface AccountWithdrawService {
	//в проекте он прописан что метод deposit возможно надо это проверить
	boolean withdraw (double amount, Account account);
	

}
