package com.jiad.intent_cal_and

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calcactivity : AppCompatActivity() {
    lateinit var txAnswer: TextView
    lateinit var fn: EditText
    lateinit var sn: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mult: Button
    lateinit var divi: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcactivity)
        txAnswer = findViewById(R.id.txAnswer)
        fn = findViewById(R.id.FN)
        sn = findViewById(R.id.Sn)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.subtract)
        mult = findViewById(R.id.multiply)
        divi = findViewById(R.id.divide)

        add.setOnClickListener {
            val fn = fn.text.toString()
            val sn = sn.text.toString()
            if (fn.isEmpty() && sn.isEmpty()) {
                txAnswer.text = "Pleaser fill in the details"
            } else {
                var answer = fn.toDouble() + sn.toDouble()
                txAnswer.text = answer.toString()
            }


        }
        sub.setOnClickListener {
            val fn = fn.text.toString()
            val sn = sn.text.toString()
            if (fn.isEmpty() && sn.isEmpty()) {
                txAnswer.text = "Pleaser fill in the details"
            } else {
                var answer = fn.toDouble() - sn.toDouble()
                txAnswer.text = answer.toString()
            }
        }
        mult.setOnClickListener {
            val fn = fn.text.toString()
            val sn = sn.text.toString()
            if (fn.isEmpty() && sn.isEmpty()) {
                txAnswer.text = "Pleaser fill in the details"
            } else {
                var answer = fn.toDouble() * sn.toDouble()
                txAnswer.text = answer.toString()
            }
        }
        divi.setOnClickListener {
            val fn = fn.text.toString()
            val sn = sn.text.toString()
            if (fn.isEmpty() && sn.isEmpty()) {
                txAnswer.text = "Pleaser fill in the details"
            } else {
                var answer = fn.toDouble() / sn.toDouble()
                txAnswer.text = answer.toString()
            }
        }
    }
}