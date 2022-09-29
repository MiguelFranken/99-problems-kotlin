package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P14Test {
    @Test
    fun `duplicate the elements of a list`() {
        assertContentEquals("aabbccccdd".toList(), duplicate("abccd".toList()))
    }

    @Test
    fun `alternative duplicate the elements of a list`() {
        assertContentEquals("aabbccccdd".toList(), duplicate2("abccd".toList()))
    }
}
