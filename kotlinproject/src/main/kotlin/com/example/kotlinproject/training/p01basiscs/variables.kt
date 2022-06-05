package com.example.kotlinproject.training.p01basiscs

val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
var x = 5

fun main() {
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    var d =5
    println(d)

    d+=1
    println(d)

    println(d++)
    println(d)

    println(++d)
    println(d)

    println(x)
    fun incrementX() {
        x++;
    }
    incrementX();
    println(x)

    val nullableBoolean: Boolean? = null;
    if(nullableBoolean == true) println("nullableBoolean is true") else println("false")
    //if(b) println("b is true") else println("false") does not compile

    val b1: Boolean = false;
    if(b1) println("b1 is true") else println("false")

}
