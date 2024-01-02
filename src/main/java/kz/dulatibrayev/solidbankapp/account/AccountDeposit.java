package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountDeposit extends Account {
	
	public AccountDeposit(AccountType accountType, String id, String clientID, double balance,
			boolean withdrawAllowed) {
		super(accountType, id, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}

}
