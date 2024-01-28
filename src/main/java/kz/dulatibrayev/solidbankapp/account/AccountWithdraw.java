package kz.dulatibrayev.solidbankapp.account;

import jakarta.persistence.Entity;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

@Entity
public class AccountWithdraw extends AccountDeposit {

	public AccountWithdraw(long id, AccountType accountType, String clientID, double balance, boolean withdrawAllowed) {
		super(id, accountType, clientID, balance, withdrawAllowed);
	}

}
