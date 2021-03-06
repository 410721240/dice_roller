package com.example.dice_rollerdii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView    //data member

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage= findViewById(R.id.dice_image)

        rollButton.setOnClickListener{rollDice()} //lambda expression
    }

    private fun rollDice() {
        //Toast.makeText( this, "button clicked", Toast.LENGTH_SHORT) .show()
        //chaining call
        //this is a comment

        val randomInt = (1..6).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //textResult.text = randomInt.toString() // type conversion
        //image resource in drawable
        //set image source to image view
        diceImage.setImageResource(drawableResource)

    }
}