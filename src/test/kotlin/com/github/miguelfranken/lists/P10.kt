package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P10Test {
    @Test
    fun `run-length encoding of a list`() {
        assertContentEquals(listOf(
            Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')
        ), encode("aaaabccaadeeee".toList()))
    }
}
