package kz.dulatibrayev.solidbankapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kz.dulatibrayev.solidbankapp.account.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
	List<Account> findAllByClientID(String clientId);

	

}
