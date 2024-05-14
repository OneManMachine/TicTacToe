package com.oneofone.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var a1: Button
    private lateinit var a2: Button
    private lateinit var a3: Button

    private lateinit var a4: Button
    private lateinit var a5: Button
    private lateinit var a6: Button

    private lateinit var a7: Button
    private lateinit var a8: Button
    private lateinit var a9: Button

    private lateinit var tvTurn : TextView
    private lateinit var imgBtnRestart : ImageButton

    private var currentTurn: Int = 0
    private var play: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponents()
        listeners()
        ui()

    }

    private fun initComponents() {
        a1 = findViewById(R.id.a1)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)
        a4 = findViewById(R.id.a4)
        a5 = findViewById(R.id.a5)
        a6 = findViewById(R.id.a6)
        a7= findViewById(R.id.a7)
        a8 = findViewById(R.id.a8)
        a9= findViewById(R.id.a9)

        tvTurn = findViewById(R.id.tvTurn)
        imgBtnRestart = findViewById(R.id.imgBtnRestart)
    }

    private fun listeners() {

        a1.setOnClickListener {
            if (a1.text == "" && play) {
                if (currentTurn % 2 == 0) {
                    a1.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a2.setOnClickListener {
            if (a2.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a2.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a3.setOnClickListener {
            if (a3.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a3.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a4.setOnClickListener {
            if (a4.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a4.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a4.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a5.setOnClickListener {
            if (a5.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a5.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a5.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a6.setOnClickListener {
            if (a6.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a6.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a6.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a7.setOnClickListener {
            if (a7.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a7.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a7.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a8.setOnClickListener {
            if (a8.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a8.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a8.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        a9.setOnClickListener {
            if (a9.text == "" && play) {
                if (currentTurn % 2 == 0){
                    a9.text = "X"
                    currentTurn++
                    ui()
                } else {
                    a9.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        imgBtnRestart.setOnClickListener {

            a1.text = ""
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a2.text = ""
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a3.text = ""
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a4.text = ""
            a4.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a5.text = ""
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a6.text = ""
            a6.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a7.text = ""
            a7.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a8.text = ""
            a8.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            a9.text = ""
            a9.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))

            currentTurn = 0
            play = true
            tvTurn.text = "X"
        }
    }

    private fun ui(){
        if(currentTurn%2 == 0){
            tvTurn.text = "X"
        }else{tvTurn.text = "O"}

        if((a1.text == a2.text && a2.text == a3.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a4.text == a5.text && a5.text == a6.text) && a4.text != ""){
            a4.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a6.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a7.text == a8.text && a8.text == a9.text) && a7.text != ""){
            a7.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a8.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a9.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a1.text == a4.text && a4.text == a7.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a4.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a7.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a2.text == a5.text && a5.text == a8.text) && a8.text != ""){
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a8.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a3.text == a6.text && a6.text == a9.text) && a9.text != ""){
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a6.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a9.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a1.text == a5.text && a5.text == a9.text) && a1.text != ""){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a9.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((a3.text == a5.text && a5.text == a7.text) && a3.text != ""){
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            a7.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if(currentTurn == 9 && play){
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a4.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a5.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a6.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a7.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a8.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            a9.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))

            play = false
        }

    }
}