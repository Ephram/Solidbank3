package kz.dulatibrayev.solidbankapp.cli.interfaces;

import org.springframework.stereotype.Component;

@Component
public interface WithdrawDepositOperationCLIUI {
	double requestClientAmount();
	
	String requestClientAccountNumber();
	
}
