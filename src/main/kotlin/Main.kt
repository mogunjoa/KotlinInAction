package org.mogun

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}