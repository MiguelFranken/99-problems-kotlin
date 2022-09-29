package com.github.miguelfranken.lists

fun <T> split(n: Int, list: List<T>): Pair<List<T>, List<T>> = Pair(list.take(n), list.drop(n))
