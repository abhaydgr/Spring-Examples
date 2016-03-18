package com.studytrails.tutorials.springdeclarativetransactions;


public class AccountService {

	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void create(Account account) {
		getAccountDao().insert(account);
	}

	public void transferFunds(final Account fromAccount,
			final Account toAccount, final Double transferAmount) {
				fromAccount.debit(transferAmount);
				toAccount.credit(transferAmount);
				getAccountDao().update(fromAccount);
				getAccountDao().update(toAccount);
	}

	public void transferFundsException(final Account fromAccount,
			final Account toAccount, final Double transferAmount) throws Exception {
		fromAccount.debit(transferAmount);
		toAccount.credit(transferAmount);
		getAccountDao().update(fromAccount);
		getAccountDao().update(toAccount);
		// Simulate an exception that occurs during funds transfer
		throw new Exception();
	}

	public void createAccount(Account account) {
		getAccountDao().insert(account);
	}

	public Account getAccount(String accountNumber) {
		return getAccountDao().select(accountNumber);
	}
}
