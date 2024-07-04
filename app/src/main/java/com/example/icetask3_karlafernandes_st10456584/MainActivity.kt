package com.example.icetask3_karlafernandes_st10456584

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    // Teams from https://footballdatabase.com/ranking/south-africa/1
// retrieved on 21 May 2022
    private val teams = arrayOf(
        "Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City FC"
    )

    @Suppress("NAME_SHADOWING")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the teams text view
        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)
// set the text view's text to the first team
        teamsTextView.text = teams[0]

        // change the value of element 0
        teams[0] = "Mamelodi Sundowns FC <3"
        // set the text view's text to the string representation of teams
        teamsTextView.text = Arrays.toString(teams)

        // add all the teams to the display string
        var teamsDisplay = ""
        teamsDisplay += "${teams[0]}\n"
        teamsDisplay += "${teams[1]}\n"
        teamsDisplay += "${teams[2]}\n"
        teamsDisplay += "${teams[3]}\n"
        teamsDisplay += "${teams[4]}\n"
// set the text view's text to the string representation of teams
        teamsTextView.text = teamsDisplay

        var counter = 0
        while (counter < 5) {
            teamsDisplay += "${teams[counter]}\n"
            counter++

            var counter = 0
            while (counter < teams.count()) {
                teamsDisplay += "${teams[counter]}\n"
                counter++

                for (counter in 0..<teams.count()) {
                    teamsDisplay += "${teams[counter]}\n"

                    for (team in teams) {
                        teamsDisplay += "${team}\n"


                    }
                }
            }
        }
    }
}
