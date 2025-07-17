package com.kotlinproject.carlosdev.kotlinprojectStudy

import java.time.LocalDateTime

data class Articles(
    var title: String,
    var content: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),

    val slug: String = title.toSlug()
)
