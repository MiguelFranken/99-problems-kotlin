package com.github.miguelfranken.lists

fun <T> duplicate(list: List<T>): List<T> = list.flatMap { value -> List(2) { value } }

fun <T> duplicate2(list: List<T>): List<T> = list.flatMap { listOf(it, it) }
