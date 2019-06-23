package com.restapi.common;

import java.util.ArrayList;
import java.util.List;

import com.restapi.model.Account;

public class Common {

	public static Account getAccountByIdData() {
		Account ac = new Account();
		ac.setId(1);
		ac.setName("venkat");
		ac.setCity("Hyderabad");
		ac.setBalance(23450.70);
		return ac;
	}

	public static Account createAccountData() {
		Account ac = new Account();
		ac.setId(5);
		ac.setName("ramu");
		ac.setCity("Hyderabad");
		ac.setBalance(21450.70);
		return ac;
	}

	public static List<Account> getAllAccountData() {
		List<Account> list = new ArrayList<>();
		Account ac1 = new Account();
		ac1.setId(1);
		ac1.setName("venkat");
		ac1.setCity("Hyderabad");
		ac1.setBalance(23450.70);

		Account ac2 = new Account();
		ac2.setId(2);
		ac2.setName("siva");
		ac2.setCity("Bangalore");
		ac2.setBalance(13450.70);

		Account ac3 = new Account();
		ac3.setId(3);
		ac3.setName("murali");
		ac3.setCity("Chennai");
		ac3.setBalance(17450.50);

		Account ac4 = new Account();
		ac4.setId(4);
		ac4.setName("dhanu");
		ac4.setCity("Bangalore");
		ac4.setBalance(14050.7);

		// add all account objects to list
		list.add(ac1);
		list.add(ac2);
		list.add(ac3);
		list.add(ac4);

		return list;
	}

	public static Account getUpdateAccountData() {
		Account ac2 = new Account();
		ac2.setId(2);
		ac2.setName("siva");
		ac2.setCity("Mumbai");
		ac2.setBalance(13450.70);
		return ac2;
	}

	public static Account createDeleteAccountData() {
		Account ac2 = new Account();
		ac2.setId(2);
		ac2.setName("siva");
		ac2.setCity("Mumbai");
		ac2.setBalance(13450.70);
		return ac2;
	}
}
