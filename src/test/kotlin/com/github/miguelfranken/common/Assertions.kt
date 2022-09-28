package com.github.miguelfranken.common

import kotlin.test.assertFails
import kotlin.test.assertTrue

inline fun <reified T> assertThrows(block: () -> Unit) =
    run { assertTrue(assertFails(block) is T) }
