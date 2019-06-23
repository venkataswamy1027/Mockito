package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Account;
import com.restapi.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public List<Account> list() {
		return (List<Account>) accountRepository.findAll();
	}

	public Account getById(int accountId) {
		return accountRepository.findById(accountId).get();

	}

	public Account create(Account account) {
		return accountRepository.save(account);
	}

	public Account update(Account account, int accountId) {
		account.setId(accountId);
		return accountRepository.save(account);
	}

	public void delete(int accountId) {
		accountRepository.deleteById(accountId);
	}

}
