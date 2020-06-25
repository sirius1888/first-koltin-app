package com.example.firstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showCountText()
        addCountOfClick()
    }

    private fun addCountOfClick() {
        click.setOnClickListener {
            count + 1
            count++
            count += 1
            showCountText()
        }
    }

    private fun showCountText() {
        text_view.text = "Количество нажатий: $count"
    }

}