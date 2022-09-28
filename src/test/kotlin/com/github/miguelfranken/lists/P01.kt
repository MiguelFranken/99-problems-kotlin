package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertTrue

class P01Test {
    @Test
    fun `find the last element of a list`() {
        assertEquals(8, last(listOf(1, 1, 2, 3, 5, 8)))
    }

    @Test
    fun `last element in empty list`() {
        val exception = assertFails { last(listOf<Int>()) }
        assertTrue(exception is NoSuchElementException)
    }
}
