package kz.dulatibrayev.solidbankapp.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private AccountType accountType;

	private String clientID;

	private double balance;

	private boolean withdrawAllowed;

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", id=" + id + ", clientID=" + clientID + ", balance=" + balance
				+ ", withdrawAllowed=" + withdrawAllowed + "]";
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long id, AccountType accountType, String clientID, double balance, boolean withdrawAllowed) {
		this.accountType = accountType;
		this.id = id;
		this.clientID = clientID;
		this.balance = balance;
		this.withdrawAllowed = withdrawAllowed;
	}

	public double getBalance() {
		return balance;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public boolean isWithdrawAllowed() {
		return withdrawAllowed;
	}

	public void setWithdrawAllowed(boolean withdrawAllowed) {
		this.withdrawAllowed = withdrawAllowed;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
