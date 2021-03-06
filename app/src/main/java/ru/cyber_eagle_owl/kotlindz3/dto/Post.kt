package ru.cyber_eagle_owl.kotlindz3.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val created: String,
    var likeCount: Long = 0L,
    var commentCount: Long = 0L,
    var shareCount: Long = 0L,
    var likedByMe: Boolean,
    var commentedByMe: Boolean,
    var sharedByMe: Boolean
) {
}