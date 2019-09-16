package com.example.cs4237hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(): String = "OK"

    fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

    fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

    fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
    )

    fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }
}
