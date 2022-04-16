package com.aedo.admin_heaven

data class NoticeModel(
    val result : List<Announcement>? = null
)

data class Announcement(
    val id : String? = null,
    val title : String? = null,
    val content : String? = null,
    val created : String? = null
)
