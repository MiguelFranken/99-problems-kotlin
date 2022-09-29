package com.github.miguelfranken.lists

fun <T> directEncode(list: List<T>): List<Pair<Int,T>> =
    if (list.isEmpty()) emptyList()
    else {
        val packed = list.takeWhile { it == list.first() }
        listOf(Pair(packed.size, packed.first())) + directEncode(list.drop(packed.size))
    }

fun <T> directEncode2(list: List<T>): List<Pair<Int, T>> = list.fold(emptyList()) { acc, value ->
    if (acc.isEmpty()) listOf(Pair(1, value))
    else {
        val last = acc.last()
        if (last.second == value) acc.dropLast(1) + Pair(last.first + 1, value)
        else acc + Pair(1, value)
    }
}
