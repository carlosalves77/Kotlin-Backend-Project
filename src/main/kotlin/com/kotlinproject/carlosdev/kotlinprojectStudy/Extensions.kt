package com.kotlinproject.carlosdev.kotlinprojectStudy

import java.util.Locale

fun String.toSlug(): String = lowercase(Locale.getDefault())
    .replace("\n", " ")
    .replace("[^a-z\\d\\s]".toRegex(), " ")
    .split(" ")
    .joinToString("-")
    .replace("-+".toRegex(), "-")