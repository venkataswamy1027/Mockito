package com.restapi.service;

import static org.junit.Assert.assertNotNull;
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
import com.restapi.controller.AccountControllerTest;
import com.restapi.model.Account;
import com.restapi.repository.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountControllerTest.class);

	@MockBean
	AccountRepository accountRepository;

	@Autowired
	AccountService accountService;

	@Test
	public void testCreateAccount() {
		LOGGER.info("testCreateAccount method executed");
		// ARRANGE
		Account createAccount = Common.createAccountData();
		LOGGER.info("createAccount {}", createAccount);
		LOGGER.info("create {}", accountService.create(createAccount));
		when(accountService.create(createAccount)).thenReturn(createAccount);
	}

	@Test
	public void testAccountById() {
		LOGGER.info("testAccountById method executed");
		// ARRANGE
		Account account = Common.getAccountByIdData();
		LOGGER.info("account {}", account);
		assertNotNull(accountRepository.findById(account.getId()));
		when(accountService.getById(account.getId())).thenReturn(account);
	}

	@Test
	public void testGetAllAccounts() {
		LOGGER.info("testGetAllAccounts method executed");
		// ARRANGE
		List<Account> accounts = Common.getAllAccountData();
		LOGGER.info("accounts {}", accounts);
		when(accountService.list()).thenReturn(accounts);
	}

	@Test
	public void testUpdateAccount() {
		LOGGER.info("testUpdateAccount method executed");
		// ARRANGE
		Account account = Common.getUpdateAccountData();
		LOGGER.info("update account {}", account);
		when(accountService.update(account, account.getId())).thenReturn(account);

	}

	@Test
	public void testDeleteAccount() {
		LOGGER.info("testDeleteAccount method executed");
		// ARRANGE
		Account account = Common.createDeleteAccountData();
		LOGGER.info("delete account {}", account);
		accountService.delete(account.getId());
	}

	@Test
	public void testAccountByIdByRepo() {
		LOGGER.info("testAccountByIdByRepo method executed");
		// ARRANGE
		Account account = Common.getAccountByIdData();
		LOGGER.info("account {}", account);
		assertNotNull(accountRepository.findById(account.getId()));
	}
}
