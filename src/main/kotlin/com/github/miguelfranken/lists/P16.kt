package com.github.miguelfranken.lists

fun <T> drop(n: Int, list: List<T>): List<T> = list.filterIndexed { i, _ -> (i + 1) % n != 0 }
