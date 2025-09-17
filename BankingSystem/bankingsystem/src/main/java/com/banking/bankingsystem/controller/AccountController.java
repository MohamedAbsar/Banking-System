package com.banking.bankingsystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.banking.bankingsystem.entity.Account;
import com.banking.bankingsystem.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	// Create a new account
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}

	// Get all accounts
	@GetMapping("/")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	// Get account by ID
	@GetMapping("/{id}")
	public Account getAccount(@PathVariable int id) {
		return accountService.getAccount(id);
	}

	// Deposit money into an account
	@PostMapping("/{id}/deposit")
	public Account deposit(@PathVariable int id, @RequestParam double amount) {
		return accountService.deposit(id, amount);
	}

	// Withdraw money from an account
	@PostMapping("/{id}/withdraw")
	public Account withdraw(@PathVariable int id, @RequestParam double amount) {
		return accountService.withdraw(id, amount);
	}
}
