package com.kotlinproject.carlosdev.kotlinprojectStudy

import java.time.LocalDateTime

data class Articles(
    var title: String,
    var content: String,
    var createdAt: LocalDateTime = LocalDateTime.now(),

    var slug: String = title.toSlug()
)
