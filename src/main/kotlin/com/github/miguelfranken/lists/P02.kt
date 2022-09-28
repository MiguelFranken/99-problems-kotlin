package com.github.miguelfranken.lists

fun <T> penultimate(list: List<T>): T {
    if (list.size < 2) {
        throw NoSuchElementException()
    } else {
        return list[list.lastIndex - 1]
    }
}
