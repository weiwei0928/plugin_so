package com.ww.plugin.so

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ww.so.sotest.Dynamic
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                Dynamic.add(113, 112).toString(), Toast.LENGTH_SHORT
            ).show()
        }
    }
}