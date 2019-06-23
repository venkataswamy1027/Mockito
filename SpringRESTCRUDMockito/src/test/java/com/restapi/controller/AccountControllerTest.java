package com.restapi.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.restapi.common.Common;
import com.restapi.model.Account;
import com.restapi.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountControllerTest.class);

	@MockBean
	AccountService accountService;

	@Autowired
	private AccountController accountController;

	@Test
	public void testCreateAccount() {
		LOGGER.info("testCreateAccount method executed");
		// ARRANGE
		Account createAccount = Common.createAccountData();
		LOGGER.info("createAccount {}", createAccount);
		when(accountService.create(createAccount)).thenReturn(createAccount);
		// ACT
		Account response = accountController.create(createAccount);
		LOGGER.info("response {}", response);
		// ASSERT
		assertEquals(response, createAccount);
	}

	@Test
	public void testAccountById() {
		LOGGER.info("testAccountById method executed");
		// ARRANGE
		Account account = Common.getAccountByIdData();
		LOGGER.info("account {}", account);
		when(accountService.getById(account.getId())).thenReturn(account);
		// ACT
		Account response = accountController.get(account.getId());
		LOGGER.info("response {}", response);
		// ASSERT
		assertEquals(response, account);
	}

	@Test
	public void testGetAllAccounts() {
		LOGGER.info("testGetAllAccounts method executed");
		// ARRANGE
		List<Account> accounts = Common.getAllAccountData();
		LOGGER.info("accounts {}", accounts);
		when(accountService.list()).thenReturn(accounts);
		// ACT
		List<Account> response = accountController.all();
		LOGGER.info("response {}", response);
		// ASSERT
		assertEquals(response, accounts);
	}

	@Test
	public void testUpdateAccount() {
		LOGGER.info("testUpdateAccount method executed");
		// ARRANGE
		Account account = Common.getUpdateAccountData();
		LOGGER.info("update account {}", account);
		when(accountService.update(account, account.getId())).thenReturn(account);
		// ACT
		Account response = accountController.update(account, account.getId());
		LOGGER.info("response {}", response);
		// ASSERT
		assertEquals(response, response);
	}

	@Test
	public void testDeleteAccount() {
		LOGGER.info("testDeleteAccount method executed");
		// ARRANGE
		Account account = Common.createDeleteAccountData();
		LOGGER.info("delete account {}", account);
		String message = "account " + account.getId() + " deleted successfully.";
		// ACT
		String response = accountController.delete(account.getId());
		LOGGER.info("response {}", response);
		// ASSERT
		assertEquals(response, message);
	}
}
