package com.jiad.intent_cal_and

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class intentactivity : AppCompatActivity() {
    lateinit var sms:Button
    lateinit var camera:Button
    lateinit var  email:Button
    lateinit var dial:Button
    lateinit var call:Button
    lateinit var share:Button
    lateinit var mpesa:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)
        sms=findViewById(R.id.sms)
        camera=findViewById(R.id.camera)
        call=findViewById(R.id.call)
        dial=findViewById(R.id.dial)
        email=findViewById(R.id.email)
        share=findViewById(R.id.share)
        mpesa=findViewById(R.id.mpesa)

        sms.setOnClickListener {
            val uri=Uri.parse("smsto:0758831980")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Good afternoon","How are you doing today")
            startActivity(intent)

        }
        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254758831980"))

            if (ContextCompat.checkSelfPermission(
            this@intentactivity,
            android.Manifest.permission.CALL_PHONE
                )!=PackageManager.PERMISSION_GRANTED
            ){
                ActivityCompat.requestPermissions(
                    this@intentactivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            }else{
                startActivity(intent)
            }
        }
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)
        }
        mpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
            
        }
        email.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "mahitaes@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        dial.setOnClickListener {
            val phone = "+254758831980"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }
        share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }


    }
}