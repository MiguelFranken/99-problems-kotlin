package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P12Test {
    @Test
    fun `decode a run-length encoded list`() {
        assertContentEquals(
            "aaaabccaadeeee".toList(), decode(
                listOf(
                    Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')
                )
            )
        )
    }

    @Test
    fun `alternative decode a run-length encoded list`() {
        assertContentEquals(
            "aaaabccaadeeee".toList(), decode2(
                listOf(
                    Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')
                )
            )
        )
    }
}
