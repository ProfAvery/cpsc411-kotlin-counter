package edu.fullerton.ecs.cpsc411.kotlincounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun TextView.increment() {
        val countString = this.text.toString()
        val countNum = Integer.parseInt(countString)
        this.text = (countNum + 1).toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementButton.setOnClickListener {
            counterTextView.increment()
        }
    }

}
