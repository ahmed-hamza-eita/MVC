package com.hamza.mvc_architecture.models

import com.hamza.mvc_architecture.models.domains.User

class FakeDatabase {
    fun getCurrentUser() =
        User("Ahmed", 2002)

}