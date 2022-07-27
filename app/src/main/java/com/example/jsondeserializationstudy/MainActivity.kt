package com.example.jsondeserializationstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class MyJSONDataClass(
    val data1: Int,
    val data2: String,
    val list: List<Int>)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mapper = jacksonObjectMapper()
        val jsonString = """
            {
                "data1": 1234,
                "data2": "Hello",
                "list": [1, 2, 3]
            }
        """.trimIndent()
    }
}