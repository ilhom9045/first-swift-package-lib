package com.swiftpackage.lib

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! version 2.0.0"
    }
}