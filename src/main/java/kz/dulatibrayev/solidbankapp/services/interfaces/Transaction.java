package kz.dulatibrayev.solidbankapp.services.interfaces;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming a generated ID
	private long id; // Primary key of Transaction entity

	@ManyToOne(fetch = FetchType.LAZY) // Optionally specify fetch strategy
	@JoinColumn(name = "accountId", referencedColumnName = "id")
	private Account account;

	private double balance;
	private OperationType operationType;

	public Transaction(Account account, double balance, OperationType operationType) {
		this.account = account;
		this.balance = balance;
		this.operationType = operationType;

	}
}
