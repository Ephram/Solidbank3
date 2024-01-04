package kz.dulatibrayev.solidbankapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kz.dulatibrayev.solidbankapp.account.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

}
