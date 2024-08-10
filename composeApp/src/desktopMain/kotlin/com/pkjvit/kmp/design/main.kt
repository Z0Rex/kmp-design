package com.pkjvit.kmp.design

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp-design",
    ) {
        App()
    }
}