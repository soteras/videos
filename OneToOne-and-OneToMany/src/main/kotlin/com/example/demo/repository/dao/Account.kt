package com.example.demo.repository.dao

import javax.persistence.*

@Entity(name = "accounts")
class Account(
        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @OneToOne(mappedBy = "account", fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.ALL))
        var user: User? = null
)
