package kz.dulatibrayev.solidbankapp.app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import kz.dulatibrayev.solidbankapp.cli.basic.AccountBasicCLI;
import kz.dulatibrayev.solidbankapp.cli.basic.MyCLI;
import kz.dulatibrayev.solidbankapp.dao.MemoryAccountDAO;
import kz.dulatibrayev.solidbankapp.services.AccountCreationServiceImpl;
import kz.dulatibrayev.solidbankapp.services.AccountDepositServiceImpl;
import kz.dulatibrayev.solidbankapp.services.AccountListingServiceImpl;
import kz.dulatibrayev.solidbankapp.services.AccountWithdrawServiceImpl;
import kz.dulatibrayev.solidbankapp.services.MemoryTransactionDAO;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountCreationService;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionDAO;
import kz.dulatibrayev.solidbankapp.transaction.TransactionDeposit;
import kz.dulatibrayev.solidbankapp.transaction.TransactionDepositCLI;
import kz.dulatibrayev.solidbankapp.transaction.TransactionWithdraw;
import kz.dulatibrayev.solidbankapp.transaction.TransactionWithdrawCLI;

@SpringBootApplication
public class SolidbankappApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SolidbankappApplication.class);
	}

	@Override
	public void run(String... arg0) throws Exception {
		boolean running = true;
		String clientID = "1";

		MyCLI myCLI = getMyCli();

		AccountBasicCLI accountBasicCLI = getAccountBasicCLI();
		TransactionDepositCLI transactionDepositCLI = getTransactionDepositCLI();
		TransactionWithdrawCLI transactionWithdrawCLI = getTransactionWithdrawCLI();

		String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
		System.out.printf("Welcome to CLI bank service\n");
		System.out.printf("Enter operation number: \n");
		System.out.printf(helpMessage);
		while (running) {
			switch (myCLI.getScanner().nextLine()) {

			case "1":
				accountBasicCLI.getAccounts(clientID);
				break;

			case "2":
				accountBasicCLI.createAccountRequest(clientID);
				break;

			case "3":
				transactionDepositCLI.depositMoney(clientID);
				break;

			case "4":
				transactionWithdrawCLI.withdrawMoney(clientID);
				break;

			case "6":
				System.out.printf(helpMessage);
				break;

			case "7":
				System.out.printf("Application Closed\n");
				running = false;
				break;

			default:
				System.out.printf("Command not recognized!\n");
				break;
			}
		}
		myCLI.getScanner().close();
	}

	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

	@Bean
	public MyCLI getMyCli() {
		return new MyCLI(getScanner());
	}

	@Bean
	public AccountBasicCLI getAccountBasicCLI() {
		return new AccountBasicCLI();
	}

	@Bean
	public TransactionDepositCLI getTransactionDepositCLI() {
		return new TransactionDepositCLI();
	}

	@Bean
	public TransactionWithdrawCLI getTransactionWithdrawCLI() {
		return new TransactionWithdrawCLI();
	}

	@Bean
	public BankCore getBankCore() {
		return new BankCore();

	}

	@Bean
	public AccountCreationService getAccountCreationServiceImpl() {
		return new AccountCreationServiceImpl();
	}

	@Bean
	public MemoryAccountDAO getMemoryAccountDAO() {
		return new MemoryAccountDAO();
	}

	@Bean
	public AccountListingService getAccountListingServiceImpl() {
		return new AccountListingServiceImpl();
	}

	@Bean
	public TransactionDeposit getTransactionDeposit() {
		return new TransactionDeposit();
	}

	@Bean
	public AccountDepositService getAccountDepositServiceImpl() {
		return new AccountDepositServiceImpl();
	}

	@Bean
	public TransactionDAO getTransactionDAO() {
		return new MemoryTransactionDAO();
	}

	@Bean
	public TransactionWithdraw getTransactionWithdraw() {
		return new TransactionWithdraw();
	}

	@Bean
	public AccountWithdrawService getAccountWithdrawService() {
		return new AccountWithdrawServiceImpl();
	}

}
