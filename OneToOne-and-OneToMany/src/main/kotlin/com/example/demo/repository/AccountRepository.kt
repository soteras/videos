package com.example.demo.repository

import com.example.demo.repository.dao.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long>
