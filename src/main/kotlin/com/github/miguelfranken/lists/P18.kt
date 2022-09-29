package com.github.miguelfranken.lists

fun <T> slice(start: Int, end: Int, list: List<T>): List<T> = list.drop(start).take(end - start)
