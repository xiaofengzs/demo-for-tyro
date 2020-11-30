package com.zxf.demo

import java.util.*

fun main() {
    var x: Int = Random().nextInt();
    var y = 0
    when(x) {
        1 -> { y = 1; }
        2 -> { y = 2 }
        else -> {
            y = 3
        }
    }

    val max = if(x > y) {
        x
    } else {
        y
    }

    Direction.EAST

    val listOf = listOf(1, 2, 3, 4, 5, 6, 1, 2, 1, 2, 1, 2)
    val listOf1 = listOf(1, 2)
    val subtract = listOf.subtract(listOf1)
    println(subtract)
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int, val a: String) {
    RED(0xFF0000, "RED"),
    GREEN(0x00FF00, " GREEN"),
    BLUE(0x0000FF, "BLUE")
}
