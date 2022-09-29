package com.github.miguelfranken.lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class P09Test {
    @Test
    fun `pack consecutive duplicates of list elements into sublists`() {
        assertContentEquals(listOf("a".toList()), pack("a".toList()))
        assertContentEquals(listOf("aaa".toList()), pack("aaa".toList()))
        assertContentEquals(listOf(
            "aaaa".toList(), "b".toList(), "cc".toList(), "aa".toList(), "d".toList(), "eeee".toList()
        ), pack("aaaabccaadeeee".toList()))
    }
}
