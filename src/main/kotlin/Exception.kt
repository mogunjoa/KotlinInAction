package org.mogun

import java.io.BufferedReader

fun readNumber(reader: BufferedReader) {
    val num = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(num)
}