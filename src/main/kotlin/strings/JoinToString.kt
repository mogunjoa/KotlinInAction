package strings

fun<T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
): String {
    val builder = StringBuilder(prefix)

    for((index, value) in collection.withIndex()) {
        if(index > 0) builder.append(separator)
        builder.append(value)
    }

    builder.append(postfix)

    return builder.toString()
}

