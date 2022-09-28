package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P05Test {
    @Test
    fun `reverse a list`() {
        val list = listOf(1,2,3)
        assertContentEquals(list.reversed(), reverse(list))
    }

    @Test
    fun `reverse a list alternative`() {
        val list = listOf(1,2,3)
        assertContentEquals(list.reversed(), reverse2(list))
    }
}
