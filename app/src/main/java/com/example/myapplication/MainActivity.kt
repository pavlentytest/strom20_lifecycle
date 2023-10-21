package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private var counter: Int = 0
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Сообщение!", Toast.LENGTH_LONG).show()

        Log.d("RRR","onCreate")

        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)

        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }

    }
    // методы жизненного цикла активности

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY,counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt(KEY,0)
        tv.text = counter.toString()
    }

    companion object {
        const val KEY = "key"
        fun test() {

        }
    }
}