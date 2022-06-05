package com.example.kotlinproject.training.p01basiscs

fun main() {

    var a = 1

    var str1 = "a is $a"
    println(str1)

    var str2 = "${str1.replace("is", "was")}"
    println(str2)

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    var b = 2
    var maxval = if (a > b) a else b

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var position = 0
    while (position < items.size) {
        println("item at $position is ${items[position]}")
        position++
    }

    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    println(describe(1))
    println(describe(1L))
    println(describe(true))
    println(describe("abc"))

    val fitsInRange = (1 in 1..10)

    if (items.size !in items.indices) {
        println("index starts with 0, last index = ${items.size}-1")
    }

    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    items
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    fun parseNonNegative(int: Int): Int? = if(int > 0) int else null;
    println("-1 -> ${parseNonNegative(-1)}")
    println("1 -> ${parseNonNegative(1)}")

    fun multiply(a: Int, b: Int) {
        val nonNegativeA = parseNonNegative(a)
        val nonNegativeB = parseNonNegative(b)

        //println(nonNegativeA * nonNegativeB)     Type mismatch. Required: Int Found:Int?
        if (nonNegativeA != null && nonNegativeB != null) {
            // x and y are automatically cast to non-nullable after null check
            println("$a * $b = ${nonNegativeA * nonNegativeB}")
        }
        else {
            println("'$a' or '$b' is not a non-negative")
        }
    }

    multiply(1,2)
    multiply(1,-2)
    //println(multiply(1,null))   b is not nullable


    var a1 = 1
    var b1 = 2
    println("a1:${a1} b1:${b1}")   //a1:1 b1:2
    a1 = b1.also { b1 = a1 }
    println("a1:${a1} b1:${b1}")  //a1:2 b1:1

    var a2 = 1
    var b2 = 2
    var c2 = 3
    a2 = b2.also { b2 = c2.also { c2 = a2 } }
    println("a2:${a2} b2:${b2} c2:${c2}")  //a1:2 b1:1

    fun notImplemented(): Int = TODO("IMPLEMENT ME")
    try {
        notImplemented()
    } catch (ex: NotImplementedError) {
        println(ex)
    }
}
