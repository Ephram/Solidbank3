package kz.dulatibrayev.solidbankapp.cli.interfaces;

import org.springframework.stereotype.Component;

import kz.dulatibrayev.solidbankapp.enums.AccountType;


public interface CreateAccountOperationUI {

	public AccountType requestAccountType();

}
