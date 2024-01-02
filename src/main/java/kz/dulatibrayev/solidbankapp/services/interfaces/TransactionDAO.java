package kz.dulatibrayev.solidbankapp.services.interfaces;

import java.util.List;

public interface TransactionDAO {
	List<Transaction> getTransactions();

	void addTransaction(Transaction transaction);
}
