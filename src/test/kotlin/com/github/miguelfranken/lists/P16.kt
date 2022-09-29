package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P16Test {
    @Test
    fun `drop every Nth element from a list`() {
        assertContentEquals("abdeghjk".toList(), drop(3, "abcdefghijk".toList()))
    }
}
