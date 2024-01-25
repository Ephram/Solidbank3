package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class AccountDeposit extends Account {

	public AccountDeposit(long id, AccountType accountType, String clientID, double balance, boolean withdrawAllowed) {
		super(id, accountType, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}

}
