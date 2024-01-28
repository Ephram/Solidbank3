package kz.dulatibrayev.solidbankapp.services.interfaces;

import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long>{
	
}
