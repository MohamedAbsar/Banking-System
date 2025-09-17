package com.banking.bankingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingsystem.entity.Account;
import com.banking.bankingsystem.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	// Create new account
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}

	// Get all accounts
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	// Get account by ID
	public Account getAccount(int id) {
		Optional<Account> optional = accountRepository.findById(id);
		return optional.orElse(null);
	}

	// Deposit amount to account
	public Account deposit(int id, double amount) {
		Account account = getAccount(id);
		if (account != null) {
			account.setBalance(account.getBalance() + amount);
			return accountRepository.save(account);
		}
		return null;
	}

	// Withdraw amount from account
	public Account withdraw(int id, double amount) {
		Account account = getAccount(id);
		if (account != null && account.getBalance() >= amount) {
			account.setBalance(account.getBalance() - amount);
			return accountRepository.save(account);
		}
		return null;
	}
}
