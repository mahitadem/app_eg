package com.jiad.intent_cal_and

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonint:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Buttoncalc=findViewById(R.id.calc)

        Buttonint=findViewById(R.id.inte)

        Buttonweb=findViewById(R.id.web)

        Buttoncalc.setOnClickListener {
            val intent=Intent(this,calcactivity::class.java)
            startActivity(intent)
        }

        Buttonint.setOnClickListener {
            val intent=Intent(this,intentactivity::class.java)
            startActivity(intent)
        }

        Buttonweb.setOnClickListener {
            val intent=Intent(this,webactivity::class.java)
            startActivity(intent)
        }
    }
}