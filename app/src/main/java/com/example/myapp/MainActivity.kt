package com.example.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height = findViewById<EditText>(R.id.height_id)
        val weight = findViewById<EditText>(R.id.weight_id)
        val cal_btn = findViewById<Button>(R.id.submit_btn_id)
        val result = findViewById<TextView>(R.id.op_text_id)
        val linear = findViewById<LinearLayout>(R.id.linear_id)

        cal_btn.setOnClickListener {
            val getheight = height.text.toString().toDouble()
            val height_in_m = getheight/100
            val getweight = weight.text.toString().toDouble()
            val bmi_calculate = getweight/(height_in_m * height_in_m)

            if( bmi_calculate < 18){
                result.text = "You're UnderWeight"
                linear.setBackgroundColor(resources.getColor(R.color.underw))
            }
            else if(bmi_calculate >=25 && bmi_calculate < 30){
                result.text = "You're OverWeight"
                linear.setBackgroundColor(resources.getColor(R.color.overw))
            }
            else if(bmi_calculate >= 30){
                result.text = "You're Obesity"
                linear.setBackgroundColor(resources.getColor(R.color.obesity))
            }
            else{
                result.text = "You're Normal Weight(Healthy)"
                linear.setBackgroundColor(resources.getColor(R.color.noarmalw))
            }

//            when {
//                bmi_calculate < 18 -> result.text = "You're UnderWeight"
//                bmi_calculate >= 18 && bmi_calculate < 25 -> result.text = "You're Normal Weight(Healthy)"
//                bmi_calculate >=25 && bmi_calculate < 30 -> result.text = "You're OverWeight"
//                bmi_calculate >= 30 -> result.text = "You're Obesity"
//            }
        }
    }
}