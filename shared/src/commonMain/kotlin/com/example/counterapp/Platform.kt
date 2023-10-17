package com.example.counterapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform