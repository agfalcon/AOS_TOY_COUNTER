package kgb.toyproject.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter = findViewById<TextView>(R.id.text_counter)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val btnPlus = findViewById<Button>(R.id.btn_plus)


        var number = 0

        btnReset.setOnClickListener{
            number = 0
            textViewCounter.text = number.toString()
        }

        btnPlus.setOnClickListener {
            number++
            textViewCounter.text = number.toString()
        }
    }
}