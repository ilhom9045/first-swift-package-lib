package com.swiftpackage.lib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform