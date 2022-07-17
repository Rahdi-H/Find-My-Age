package com.example.findmyage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            GetYourAge()
        }
    }
    fun GetYourAge() {
        val userBY = Integer.parseInt(editTextDateY.text.toString())
        val userBM = Integer.parseInt(editTextDateM.text.toString())
        val deviceYear = Calendar.getInstance().get(Calendar.YEAR)
        val deviceMonth = Calendar.getInstance().get(Calendar.MONTH) + 1

        if (userBM > deviceMonth) {
                val ageM = userBM - deviceMonth
                val ageY = deviceYear - userBY
                textView.text = "You are ${ageY - 1} years ${12 - ageM} months old"

        } else {

            val ageM = deviceMonth - userBM
            val ageY = deviceYear - userBY
            textView.text = "You are $ageY years $ageM months old"
        }
    }
}