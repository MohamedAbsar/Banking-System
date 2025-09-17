package com.banking.bankingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankingsystem.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
