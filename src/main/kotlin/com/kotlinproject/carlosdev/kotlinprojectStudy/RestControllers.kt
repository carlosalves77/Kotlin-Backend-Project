package com.kotlinproject.carlosdev.kotlinprojectStudy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/articles")
class ArticleController {

    val articles = mutableListOf(
        Articles(
            "My Title",
            "my content"

        )
    )

    @GetMapping
    fun articles() = articles

}