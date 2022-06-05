package com.example.kotlinproject.training.p01basiscs

import java.util.*

fun main() {

    val list = listOf("a", "b", "c")  //readonly list
    println(list)
    println(list[1]) //2nd item
    println(list.last())

    val listEmpty = listOf<String>()
    // println(listEmpty.last())   NoSuchElementException: List is empty.
    println(listEmpty.firstOrNull())

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)
    println(map["a"])
    println(map["missing"])

    val map1 = map.plus("d" to 4)
    println(map)
    println(map1)

    for ((k, v) in map) {
        println("$k -> $v")
    }

    for (i in 1 .. 5) {}
    for (i in 1 until  5) {}
    for (i in 1..5 step 2) {}
    for (i in 5 downTo 1) {}
    (1..5).forEach { it -> println(it) }

    println("--pre")
    val p: String by lazy {
        println("--init")
        "hello"}
    println("--post")
    println(p)

    fun String.newFunction() { println("calling newFunction on: `$this`") }
    "string,,,".newFunction()

    val res1 = ResourceObject
    val res2 = ResourceObject
    println(res1.name)
    println(res1.hashCode())
    println(res2.hashCode())

    val myObject = object : MyAbstractClass() {
        override fun doSomething() {}
        override fun sleep() {}
    }

    fun nullableLength(input: String?) = input?.length
    println("null -> ${nullableLength(null)}")
    println("abc -> ${nullableLength("abc")}")

    fun nullSafeLength(input: String?) = input?.length ?: -1
    println("null -> ${nullSafeLength(null)}")
    println("abc -> ${nullSafeLength("abc")}")

    fun nullSafeOrElseLength(input: String?) = input?.length ?: throw IllegalStateException("Input is missing!")
    try {
        println("null -> ${nullSafeOrElseLength(null)}")
    } catch (e: IllegalStateException) {
        println("-----"+e)
    } finally {
        println("-----finally")
    }

    fun executionOnNonNull(input: String?) = input?.let { println("---got:${it}") }
    executionOnNonNull("abc")
    executionOnNonNull(null)

    fun transformOnNonNull(input: String?) = input?.let { it.uppercase() }
    println(transformOnNonNull("abc"))
    println(transformOnNonNull(null))

    fun transform(input: String) = input.reversed()
    val default = "DEFAULT"
    fun transformWithDefaultOnNull(input: String?) = input?.let { transform(it) } ?: default
    println(transformWithDefaultOnNull("abc"))
    println(transformWithDefaultOnNull(null))

    fun arrayOfMinusOnes(size: Int): IntArray = IntArray(size).apply { fill(-1) }

    val commands = Commands()
    with(commands) {
        commad1()
        commad3()
        commad2()
        commad1()
    }
}

object ResourceObject {
    val name = "Name"
}

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

class Commands {
    fun commad1() = println("--1")
    fun commad2() = println("--2")
    fun commad3() = println("--3")
}