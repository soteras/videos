package com.example.demo.controller

import com.example.demo.repository.AccountRepository
import com.example.demo.repository.dao.Account
import com.example.demo.repository.dao.Book
import com.example.demo.repository.dao.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController {
    @Autowired
    private lateinit var repository: AccountRepository

    @PostMapping
    fun create(): Account {
        val book1 = Book(title = "Titulo 1")
        val book2 = Book(title = "Titulo 2")
        val account = Account()

        val user = User(
                name = "Soteras",
                account = account,
                books = listOf(book1, book2)
        )

        book1.user = user
        book2.user = user
        account.user = user

        return repository.save(account)
    }
}