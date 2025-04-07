package org.mogun

fun fizzbuzz(i: Int) = when {
    i % 3 == 0 && i % 5 == 0 -> "피즈버즈"
    i % 3 == 0 -> "피즈"
    i % 5 == 0 -> "버즈"
    else -> "$i"
}