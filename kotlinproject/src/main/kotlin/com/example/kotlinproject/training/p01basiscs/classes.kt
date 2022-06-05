package com.example.kotlinproject.training.p01basiscs

fun main() {
    val rectangle = Rectangle(1.0,2.0)
    println(rectangle)
    println(rectangle.perimeterIncorrect)
    println(rectangle.area())

    rectangle.apply { height = 5.0 }
    println(rectangle)
    println(rectangle.perimeterIncorrect)
    println(rectangle.lazyPerimeterIncorrect)
    println(rectangle.area())
}

class Shape

class Rectangle(var height: Double, var length: Double) {
    var perimeterIncorrect = (height + length) * 2
    val lazyPerimeterIncorrect: Double by lazy {(height + length) * 2}
    fun area() = height * length
    override fun toString(): String {
        return "h:$height, l:$length"
    }
}

open class ShapeInheritable

class RectangleIsShape(var height: Double, var length: Double): ShapeInheritable() {
    var perimeter = (height + length) * 2
}
