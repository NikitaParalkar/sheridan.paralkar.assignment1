package com.example.sheridanparalkarassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import com.example.sheridanparalkarassignment1.databinding.ActivityOutputBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_output.*
import java.util.*
import kotlin.random.Random


class InputActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the User Change image
        rock.setOnClickListener {
            playTurn("rock")
            userImage.setImageResource(R.drawable.rock)
        }

        paper.setOnClickListener {
            playTurn("paper")
            userImage.setImageResource(R.drawable.paper)
        }

        scissor.setOnClickListener {
            playTurn("scissor")
            userImage.setImageResource(R.drawable.scissor)
        }


    }

    //getting the Computer Change image
    fun playTurn(userChoice: String) {
        var compChoice = ""

        var randnum = Random.nextInt(3)

        if (randnum == 0) {
            compChoice = "rock"
            compImage.setImageResource(R.drawable.rock)
        }

        if (randnum == 1) {
            compChoice = "paper"
            compImage.setImageResource(R.drawable.paper)
        }

        if (randnum == 2) {
            compChoice = "scissor"
            compImage.setImageResource(R.drawable.scissor)
        }

        //Verifying the choices
        val intent = Intent(this, OutputActivity::class.java).apply {

        }
        startActivity(intent)

        if (compChoice == userChoice) {
            makeText(this, "It a Tie", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "rock" && userChoice == "paper") {
            makeText(this, "User Wins", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "paper" && userChoice == "rock") {
            makeText(this, "User Looses", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "scissor" && userChoice == "rock") {
            makeText(this, "User Win", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "rock" && userChoice == "scissor") {
            makeText(this, "User Lose", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "paper" && userChoice == "scissor") {
            makeText(this, "User Win", Toast.LENGTH_SHORT).show()
        }

        if (compChoice == "scissor" && userChoice == "paper") {
            makeText(this, "User Lose", Toast.LENGTH_SHORT).show()
        }
    }
}
