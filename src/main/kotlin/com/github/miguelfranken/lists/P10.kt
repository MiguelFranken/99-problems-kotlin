package com.github.miguelfranken.lists

/**
 * Use the result of problem P09 to implement the so-called
 * run-length encoding data compression method.
 * Consecutive duplicates of elements are encoded as
 * tuples (N, E) where N is the number of duplicates of the element E.
 *
 * ```
 * encode("aaaabccaadeeee".toList())
 * // [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
 * ```
 */
fun <T> encode(list: List<T>): List<Pair<Int, T>> = pack(list).map { Pair(it.size, it.first()) }
