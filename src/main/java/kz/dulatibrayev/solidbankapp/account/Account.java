package kz.dulatibrayev.solidbankapp.account;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

@Table(schema = "V1__initial_schema.sql")
public class Account {

	@Id
	private long id;

	@Column("ACCOUNTTYPE")
	private AccountType accountType;
	@Column("CLIENTID")
	private String clientID;
	@Column("BALANCE")
	private double balance;
	@Column("WITHDRAWALLOWED")
	private boolean withdrawAllowed;

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", id=" + id + ", clientID=" + clientID + ", balance=" + balance
				+ ", withdrawAllowed=" + withdrawAllowed + "]";
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
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
