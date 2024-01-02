package kz.dulatibrayev.solidbankapp.services;

import java.util.ArrayList;
import java.util.List;

import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionDAO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MemoryTransactionDAO implements TransactionDAO {

	private List<Transaction> transactions = new ArrayList<Transaction>();

	@Override
	public List<Transaction> getTransactions() {

		return transactions;
	}

	@Override
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);

	}

}
