package com.github.miguelfranken.lists

import com.github.miguelfranken.common.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

internal class P02Test {
    @Test
    fun `find the last but one element of a list`() {
        assertEquals(5, penultimate(listOf(1, 1, 2, 3, 5, 8)))
    }

    @Test
    fun `penultimate element in list smaller than 2`() {
        assertThrows<NoSuchElementException> { penultimate(listOf(1)) }
    }
}
