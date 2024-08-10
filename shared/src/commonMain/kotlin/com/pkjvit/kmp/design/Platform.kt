package com.pkjvit.kmp.design

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform