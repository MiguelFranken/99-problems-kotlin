package com.github.miguelfranken.lists

fun <T> last(list: List<T>): T {
    if (list.isEmpty()) {
        throw NoSuchElementException()
    } else {
        return list[list.lastIndex]
    }
}
