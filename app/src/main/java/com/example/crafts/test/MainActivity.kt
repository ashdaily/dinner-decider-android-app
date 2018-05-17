package com.example.crafts.test
import java.util.Random

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese","Japanese","Indian","Taiwanese","Italian","American")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            foodNameOutput.text = foodList[randomFood]
        }
        addFoodBtn.setOnClickListener{
            val newFood = foodNameInput.text.toString()
            foodList.add(newFood)
            foodNameInput.text.clear()
        }
    }
}
