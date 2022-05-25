package com.example.ufimtsevpr10var2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var second = findViewById(R.id.second) as androidx.constraintlayout.widget.ConstraintLayout
        second.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent);
        }
    }
}