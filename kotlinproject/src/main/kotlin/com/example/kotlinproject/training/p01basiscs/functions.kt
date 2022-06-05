package com.example.kotlinproject.training.p01basiscs

fun main() {
    functionUnit(1,2)
    functionUnit(2,3)
    functionUnitInferred(3,4)
    functionUnitInferredShort(4,5)
}

fun function(a: Int, b: Int): Int {
    return a + b
}

fun functionInferredResult(a: Int, b: Int) = a + b

//does not compile
//fun functionIncorrect1(a: Int, b: Int): Int = a + b

//does not compile
//fun functionIncorrect2(a: Int, b: Int): Int = {
//    a + b
//}

fun functionUnit(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun functionUnitInferred(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun functionUnitInferredShort(a: Int, b: Int) =
    println("sum of $a and $b is ${a + b}")
