package strings

fun<T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
): String {
    val builder = StringBuilder(prefix)

    for((index, element) in this.withIndex()) {
        if(index > 0) builder.append(separator)
        builder.append(element)
    }

    builder.append(postfix)

    return builder.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
) = joinToString(separator, prefix, postfix)

