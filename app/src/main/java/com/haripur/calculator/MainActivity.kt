package com.haripur.calculator

import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Double


class MainActivity : AppCompatActivity() {

    var number1: EditText? = null
    var number2: EditText? = null
    var Add_button: Button? = null
    var result: TextView? = null
    var ans = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById<View>(R.id.editText_first_no) as EditText
        number2 = findViewById<View>(R.id.editText_second_no) as EditText
        Add_button = findViewById<View>(R.id.button) as Button
        result = findViewById<View>(R.id.textView_answer) as TextView


        Add_button!!.setOnClickListener {

            val num1 = number1!!.text.toString().toDouble()
            val num2 = number2!!.text.toString().toDouble()

            val sum = num1 + num2

            result!!.text = Double.toString(sum)
        }
    }
}