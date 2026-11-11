
package com.example.countercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var currentScreen by rememberSaveable {
                mutableStateOf("counter")
            }

            when (currentScreen) {

                "counter" -> {
                    CounterApp(
                        onNext = {
                            currentScreen = "data"
                        }
                    )
                }

                "data" -> {
                    DataDiriScreen()
                }
            }
        }
    }
}
