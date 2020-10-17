package com.example.demo.repository.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity(name = "books")
class Book(
        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        val title: String,

        @ManyToOne
        @JoinColumn(name = "user_id")
        @JsonIgnore
        var user: User? = null
)
