package com.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
