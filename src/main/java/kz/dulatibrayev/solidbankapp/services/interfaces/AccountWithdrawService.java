package kz.dulatibrayev.solidbankapp.services.interfaces;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;

public interface AccountWithdrawService {
	//в проекте он прописан что метод deposit возможно надо это проверить
	void withdraw (double amount, AccountWithdraw account);
	

}
