package com.cmps312.hellooandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtn.setOnClickListener {
            var number1 : Int = number1Edt.text.toString().toInt()
            var number2 : Int = number2Edt.text.toString().toInt()
            resultTv.text = (number1 + number2).toString()
        }

        subtractBtn.setOnClickListener {
            var number1 : Int = number1Edt.text.toString().toInt()
            var number2 : Int = number2Edt.text.toString().toInt()
            resultTv.text = (number1 - number2).toString()
        }

        multiplyBtn.setOnClickListener {
            var number1 : Int = number1Edt.text.toString().toInt()
            var number2 : Int = number2Edt.text.toString().toInt()
            resultTv.text = (number1 * number2).toString()
        }

        divideBtn.setOnClickListener {
            var number1 : Double = number1Edt.text.toString().toDouble()
            var number2 : Double = number2Edt.text.toString().toDouble()
            resultTv.text = (number1 / number2).toString()
        }
    }
}