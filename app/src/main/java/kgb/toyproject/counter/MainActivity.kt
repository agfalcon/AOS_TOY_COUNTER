package kgb.toyproject.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    private lateinit var counterViewModel : CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter = findViewById<TextView>(R.id.text_counter)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val btnPlus = findViewById<Button>(R.id.btn_plus)
        counterViewModel = ViewModelProvider(this)[CounterViewModel::class.java]

        counterViewModel.counter.observe(this, Observer<Int>{
          textViewCounter.text = it.toString()
        })

        btnReset.setOnClickListener{
            counterViewModel.reset()
        }

        btnPlus.setOnClickListener {
            counterViewModel.plus()
        }
    }
}