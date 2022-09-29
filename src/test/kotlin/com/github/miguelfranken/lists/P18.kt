package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertEquals

internal class P18Test {
    @Test
    fun `extract a slice from a list`() {
        assertEquals("defg".toList(), slice(3, 7, "abcdefghijk".toList()))
    }
}
