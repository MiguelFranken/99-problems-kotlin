package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertEquals

internal class P17Test {
    @Test
    fun `split a list into two parts`() {
        assertEquals(Pair("abc".toList(), "defghijk".toList()), split(3, "abcdefghijk".toList()))
    }
}
