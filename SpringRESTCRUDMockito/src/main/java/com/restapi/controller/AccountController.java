package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Account;
import com.restapi.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/accounts")
	public List<Account> all() {
		return accountService.list();
	}

	@GetMapping("/account/{accountId}")
	public Account get(@PathVariable int accountId) {
		return accountService.getById(accountId);
	}

	@PostMapping("/account")
	public Account create(@RequestBody Account account) {
		return accountService.create(account);
	}

	@PutMapping("/account/{accountId}")
	public Account update(@RequestBody Account account, @PathVariable int accountId) {
		return accountService.update(account, accountId);
	}

	@DeleteMapping("/account/{accountId}")
	public String delete(@PathVariable int accountId) {
		accountService.delete(accountId);
		return "account " + accountId + " deleted successfully.";
	}
}
