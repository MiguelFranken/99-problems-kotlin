package com.github.miguelfranken.lists

/**
 * Given a run-length code list generated as specified in the
 * problem P10, construct its uncompressed version.
 *
 * ```
 * decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 * // [a, a, a, a, b, c, c, a, a, d, e, e, e, e]
 * ```
 */
fun <T> decode(encoded: List<Pair<Int, T>>): List<T> =
    encoded.flatMap { (count, value) ->
        mutableListOf<T>().apply {
            for (i in 0 until count) {
                add(value)
            }
        }.toList()
    }

fun <T> decode2(encoded: List<Pair<Int, T>>): List<T> =
    encoded.flatMap { (count, value) -> List(count) { value } }
