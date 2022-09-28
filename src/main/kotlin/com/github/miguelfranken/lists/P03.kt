package com.github.miguelfranken.lists

@Throws(NoSuchElementException::class)
fun <T> nth(n: Int, list: List<T>): T {
    if (list.size <= n) {
        throw NoSuchElementException()
    } else {
        return list[n]
    }
}
