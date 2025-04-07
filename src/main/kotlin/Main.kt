package org.mogun

import org.mogun.strings.lastChar as last   // 확장 함수 이름 변경
import strings.joinToString
import java.io.BufferedReader
import java.io.StringReader

fun main() {
//    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

//    for (i in 1..100) {
//        println(fizzbuzz(i))
//    }

//    for (i in 100 downTo 1 step 2) {
//        println(fizzbuzz(i))
//    }

//    val reader = BufferedReader(StringReader("2fd"))
//    readNumber(reader)

    val list = listOf(1, 2, 3)
    println(
        list.joinToString(
            separator = ";",
            prefix = "(",
            postfix = ")"
        )
    )
    println(list.joinToString())

//    val sample = "홀리몰리 할리갈리"
//    println(sample.last())
}
