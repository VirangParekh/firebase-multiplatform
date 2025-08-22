package com.multiplatform.trial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform