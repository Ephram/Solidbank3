package kz.dulatibrayev.solidbankapp.cli.basic;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import kz.dulatibrayev.solidbankapp.cli.interfaces.CLIUI;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class MyCLI implements CLIUI {
	@Autowired
	private Scanner scanner;

	public MyCLI(Scanner scanner) {
		this.scanner = scanner;

	}
//
//	public MyCLI() {
//		this.scanner = new Scanner(System.in);
//	}

	public double requestClientAmount() {
		System.out.println("Type amount of money ");
		return Double.valueOf(this.scanner.nextLine());
	}

	public String requestClientAccountNumber() {
		System.out.println("Please enter account ID");

		return this.scanner.nextLine();

	}

	public AccountType requestAccountType() {
		System.out.println("please enter one of the account type, <CHECKING - FIXED - SAVING>");
		String accountType = scanner.nextLine();

		if (accountType.equalsIgnoreCase(AccountType.FIXED.toString())) {
			return AccountType.FIXED;
		} else if (accountType.equalsIgnoreCase(AccountType.SAVING.toString())) {
			return AccountType.SAVING;
		} else if (accountType.equalsIgnoreCase(AccountType.CHECKING.toString())) {
			return AccountType.CHECKING;
		} else {
			System.out.println("wrong type of account, try again");
			return null;
		}

	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
