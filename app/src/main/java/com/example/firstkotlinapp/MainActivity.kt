package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var swimming: String
    lateinit var adapter: MainAdapter
    //строковая переменная
    var name = "Application" //явная объявление переменной
    var appVersion = "3.1.1" //неявное объявление переменной
    val surname = "Karukes" //неявная не изменяемая переменная
    //Челочисленные переменные
    var age: Int = 12
    var size: Short = 32454
    var id: Int = 33313123
    var id2: Long = 3123131233
    //Дробные переменные
    var f: Float = 43.2F
    var f1 = 43.2F
    var d: Double = 43.1
    var d1 = 43.1
    //Условная
    var isLoaded: Boolean = false
    var symbol: Char = 'c'
    var machine: String? = null
    var machine1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("First app")
        name = "Teacher"
        swimming = "Pool"

        if (isLoaded) {
            adapter = MainAdapter()
            // здесь задаем инициализацию адаптера и recycler view
        } else {
            showToast("Ошибка интернет соединения")
        }

        when (isLoaded) {
            true -> adapter = MainAdapter()
            false -> showToast("Ошибка интернет соединения")
        }
        showToast(checkSize("M"))
        checkName(null)
    }

    private fun checkSize(size: String): String {
        return when (size) {
            "XL" -> "you are fat"
            "XLL" -> "you are big"
            "XXLL" -> "you are very fat"
            else -> "nice"
        }
    }

    private fun checkName(state: Boolean?) {
        when (state) {
            false -> showToast("state is: False")
            true -> showToast("state is: True")
            else -> showToast("state is: Null")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}

class MainAdapter() {

}