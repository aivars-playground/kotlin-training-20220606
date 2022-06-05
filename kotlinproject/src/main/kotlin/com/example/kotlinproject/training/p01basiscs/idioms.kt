package com.example.kotlinproject.training.p01basiscs

fun main() {

    val c1 = Customer("abc","abc@example.com")
    val c1a = Customer("abc","abc@example.com")
    val c2 = Customer("cde","cde@example.com")
    val m1 = MutableCustomer("m","mm@example.com", 1)
    val o1 = OptionalCustomer("nameonly1", null)
    val o2 = OptionalCustomer("nameonly2", email = "abc@example,com")
    val o3 = OptionalCustomer(email = "abc@example,com", name = "nameonly3")

    println(c1)
    println(c1.email)      //getter
    //c1.email = "aaa"     //setter does not work... it is val

    println(m1)
    m1.balance = 2
    println(m1)

    println(o1)
    println(o2)
    println(o3)

    println(c1 == c1)
    println(c1 == c1a)
    println(c1 == c2)

    println(c1.hashCode())
    println(c1a.hashCode())
    println(c2.hashCode())

    val c2c1 = c2.copy("abc", email = "abc@example.com")
    println(c2c1)
    println(c1.equals(c2c1))

}

data class Customer(val name: String, val email: String)
data class MutableCustomer(val name: String, val email: String, var balance: Int)
data class OptionalCustomer(val name: String, val email: String? , val balance: Int = 0)


