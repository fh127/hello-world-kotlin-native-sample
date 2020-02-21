package com.example.kotlin.nativeapp

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Hello World on ${platformName()}"
}