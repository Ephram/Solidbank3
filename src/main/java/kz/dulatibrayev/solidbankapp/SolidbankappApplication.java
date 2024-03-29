package kz.dulatibrayev.solidbankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kz.dulatibrayev.solidbankapp.cli.basic.AccountBasicCLI;
import kz.dulatibrayev.solidbankapp.cli.basic.MyCLI;
import kz.dulatibrayev.solidbankapp.transaction.TransactionDepositCLI;
import kz.dulatibrayev.solidbankapp.transaction.TransactionWithdrawCLI;

@SpringBootApplication
public class SolidbankappApplication implements CommandLineRunner {

	@Autowired
	MyCLI myCLI;
	@Autowired
	AccountBasicCLI accountBasicCLI;
	@Autowired
	TransactionDepositCLI transactionDepositCLI;
	@Autowired
	TransactionWithdrawCLI transactionWithdrawCLI;

	public static void main(String[] args) {
	    

		SpringApplication.run(SolidbankappApplication.class);

	}

	@Override
	public void run(String... arg0) throws Exception {
		boolean running = true;
		String clientID = "1";

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
				transactionDepositCLI.depositMoney(Long.valueOf(clientID));
				break;

			case "4":
				transactionWithdrawCLI.withdrawMoney(Long.valueOf(clientID));
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

}
