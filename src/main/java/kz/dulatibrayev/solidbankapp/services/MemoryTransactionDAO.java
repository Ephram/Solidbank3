package kz.dulatibrayev.solidbankapp.services;

import java.util.ArrayList;
import java.util.List;

import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionRepository;
import lombok.AllArgsConstructor;


public class MemoryTransactionDAO implements TransactionRepository {

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
