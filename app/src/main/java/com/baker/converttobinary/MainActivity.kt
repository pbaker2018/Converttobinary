package com.baker.converttobinary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toBinary(view: View) {
        if(editText.text.isNotEmpty()) {
            val num = editText.text.toString().toInt()
            val binaryString = Integer.toBinaryString(num)
            resultTxt.text = "⭐ $binaryString ⭐"
        } else {
            Toast.makeText(this@MainActivity, "Please enter a whole number first", Toast.LENGTH_SHORT).show()
        }
    }

    fun clearAnswer(view: View) {
        if (resultTxt.text.isNotEmpty()) {
            resultTxt.text = ""
        } else {
            Toast.makeText(this@MainActivity, "There is nothing to clear", Toast.LENGTH_SHORT).show()
        }
    }
}
