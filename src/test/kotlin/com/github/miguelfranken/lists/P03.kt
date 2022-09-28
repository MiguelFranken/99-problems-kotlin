package com.github.miguelfranken.lists

import com.github.miguelfranken.common.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

internal class P03Test {
    @Test
    fun `find the Nth element of a list`() {
        assertEquals(2, nth(2, listOf(1, 1, 2, 3, 5, 8)))
    }

    @Test
    fun `Nth element outside of list size`() {
        assertThrows<NoSuchElementException> { nth(6, listOf(1, 1, 2, 3, 5, 8)) }
    }
}
