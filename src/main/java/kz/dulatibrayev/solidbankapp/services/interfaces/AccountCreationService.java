package kz.dulatibrayev.solidbankapp.services.interfaces;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.enums.AccountType;


public interface AccountCreationService {
	void create(AccountType accountType, String bankID, String clientID, long accountID);
}
