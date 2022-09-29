package com.github.miguelfranken.lists

/**
 * If a list contains repeated elements, they should be placed in separate sublists.
 *
 * ```
 * pack("aaaabccaadeeee".toList())
 * // [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]
 * ```
 *
 * @param T the type of the list elements
 * @param list list that should be packed
 */
fun <T> pack(list: List<T>): List<List<T>> =
    if (list.isEmpty()) emptyList()
    else {
        val packed = list.takeWhile { it == list.first() }
        listOf(packed) + pack(list.drop(packed.size))
    }
