package com.springprofile.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprofile.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {
}
