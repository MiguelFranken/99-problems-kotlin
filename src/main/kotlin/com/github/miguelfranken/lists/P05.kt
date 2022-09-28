package com.github.miguelfranken.lists

fun <T> reverse(list: List<T>): List<T> = list.foldRight(listOf()) { acc, curr -> curr + acc }

fun <T> reverse2(list: List<T>): List<T> = ((list.size - 1) downTo 0).map { i -> list[i] }
