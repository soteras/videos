package com.example.demo.repository.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity(name = "users")
class User (
        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        val name: String,

        @OneToOne
        @JoinColumn(name = "account_id")
        @JsonIgnore
        val account: Account,

        @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.ALL))
        val books: List<Book>
)
