package com.example.chess

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var A1: TextView
    private lateinit var A2: TextView
    private lateinit var A3: TextView
    private lateinit var A4: TextView
    private lateinit var A5: TextView
    private lateinit var A6: TextView
    private lateinit var A7: TextView
    private lateinit var A8: TextView

    private lateinit var B1: TextView
    private lateinit var B2: TextView
    private lateinit var B3: TextView
    private lateinit var B4: TextView
    private lateinit var B5: TextView
    private lateinit var B6: TextView
    private lateinit var B7: TextView
    private lateinit var B8: TextView

    private lateinit var C1: TextView
    private lateinit var C2: TextView
    private lateinit var C3: TextView
    private lateinit var C4: TextView
    private lateinit var C5: TextView
    private lateinit var C6: TextView
    private lateinit var C7: TextView
    private lateinit var C8: TextView

    private lateinit var D1: TextView
    private lateinit var D2: TextView
    private lateinit var D3: TextView
    private lateinit var D4: TextView
    private lateinit var D5: TextView
    private lateinit var D6: TextView
    private lateinit var D7: TextView
    private lateinit var D8: TextView

    private lateinit var E1: TextView
    private lateinit var E2: TextView
    private lateinit var E3: TextView
    private lateinit var E4: TextView
    private lateinit var E5: TextView
    private lateinit var E6: TextView
    private lateinit var E7: TextView
    private lateinit var E8: TextView

    private lateinit var F1: TextView
    private lateinit var F2: TextView
    private lateinit var F3: TextView
    private lateinit var F4: TextView
    private lateinit var F5: TextView
    private lateinit var F6: TextView
    private lateinit var F7: TextView
    private lateinit var F8: TextView

    private lateinit var G1: TextView
    private lateinit var G2: TextView
    private lateinit var G3: TextView
    private lateinit var G4: TextView
    private lateinit var G5: TextView
    private lateinit var G6: TextView
    private lateinit var G7: TextView
    private lateinit var G8: TextView

    private lateinit var H1: TextView
    private lateinit var H2: TextView
    private lateinit var H3: TextView
    private lateinit var H4: TextView
    private lateinit var H5: TextView
    private lateinit var H6: TextView
    private lateinit var H7: TextView
    private lateinit var H8: TextView

    val aArray = listOf(A1,A2,A3,A4,A5,A6,A7,A8)
    val bArray = listOf(B1,B2,B3,B4,B5,B6,B7,B8)
    val cArray = listOf(C1,C2,C3,C4,C5,C6,C7,C8)
    val dArray = listOf(D1,D2,D3,D4,D5,D6,D7,D8)
    val eArray = listOf(E1,E2,E3,E4,E5,E6,E7,E8)
    val fArray = listOf(F1,F2,F3,F4,F5,F6,F7,F8)
    val gArray = listOf(G1,G2,G3,G4,G5,G6,G7,G8)
    val hArray = listOf(H1,H2,H3,H4,H5,H6,H7,H8)
//    val boardArray = arrayOf(aArray,bArray,cArray,dArray,eArray,fArray,gArray,hArray)

    var moveStageCounter = 0
    var movingPiece = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){

        A1 = findViewById(R.id.A1)
        A2 = findViewById(R.id.A2)
        A3 = findViewById(R.id.A3)
        A4 = findViewById(R.id.A4)
        A5 = findViewById(R.id.A5)
        A6 = findViewById(R.id.A6)
        A7 = findViewById(R.id.A7)
        A8 = findViewById(R.id.A8)

        B1 = findViewById(R.id.B1)
        B2 = findViewById(R.id.B2)
        B3 = findViewById(R.id.B3)
        B4 = findViewById(R.id.B4)
        B5 = findViewById(R.id.B5)
        B6 = findViewById(R.id.B6)
        B7 = findViewById(R.id.B7)
        B8 = findViewById(R.id.B8)

        C1 = findViewById(R.id.C1)
        C2 = findViewById(R.id.C2)
        C3 = findViewById(R.id.C3)
        C4 = findViewById(R.id.C4)
        C5 = findViewById(R.id.C5)
        C6 = findViewById(R.id.C6)
        C7 = findViewById(R.id.C7)
        C8 = findViewById(R.id.C8)

        D1 = findViewById(R.id.D1)
        D2 = findViewById(R.id.D2)
        D3 = findViewById(R.id.D3)
        D4 = findViewById(R.id.D4)
        D5 = findViewById(R.id.D5)
        D6 = findViewById(R.id.D6)
        D7 = findViewById(R.id.D7)
        D8 = findViewById(R.id.D8)

        E1 = findViewById(R.id.E1)
        E2 = findViewById(R.id.E2)
        E3 = findViewById(R.id.E3)
        E4 = findViewById(R.id.E4)
        E5 = findViewById(R.id.E5)
        E6 = findViewById(R.id.E6)
        E7 = findViewById(R.id.E7)
        E8 = findViewById(R.id.E8)

        F1 = findViewById(R.id.F1)
        F2 = findViewById(R.id.F2)
        F3 = findViewById(R.id.F3)
        F4 = findViewById(R.id.F4)
        F5 = findViewById(R.id.F5)
        F6 = findViewById(R.id.F6)
        F7 = findViewById(R.id.F7)
        F8 = findViewById(R.id.F8)

        G1 = findViewById(R.id.G1)
        G2 = findViewById(R.id.G2)
        G3 = findViewById(R.id.G3)
        G4 = findViewById(R.id.G4)
        G5 = findViewById(R.id.G5)
        G6 = findViewById(R.id.G6)
        G7 = findViewById(R.id.G7)
        G8 = findViewById(R.id.G8)

        H1 = findViewById(R.id.H1)
        H2 = findViewById(R.id.H2)
        H3 = findViewById(R.id.H3)
        H4 = findViewById(R.id.H4)
        H5 = findViewById(R.id.H5)
        H6 = findViewById(R.id.H6)
        H7 = findViewById(R.id.H7)
        H8 = findViewById(R.id.H8)
    }







    fun colorCheck(){
        if (moveStageCounter==0){

        }
    }

    fun disableAll(){
        A1.isEnabled = false
        A2.isEnabled = false
        A3.isEnabled = false
        A4.isEnabled = false
        A5.isEnabled = false
        A6.isEnabled = false
        A7.isEnabled = false
        A8.isEnabled = false

        B1.isEnabled = false
        B2.isEnabled = false
        B3.isEnabled = false
        B4.isEnabled = false
        B5.isEnabled = false
        B6.isEnabled = false
        B7.isEnabled = false
        B8.isEnabled = false

        C1.isEnabled = false
        C2.isEnabled = false
        C3.isEnabled = false
        C4.isEnabled = false
        C5.isEnabled = false
        C6.isEnabled = false
        C7.isEnabled = false
        C8.isEnabled = false

        D1.isEnabled = false
        D2.isEnabled = false
        D3.isEnabled = false
        D4.isEnabled = false
        D5.isEnabled = false
        D6.isEnabled = false
        D7.isEnabled = false
        D8.isEnabled = false

        E1.isEnabled = false
        E2.isEnabled = false
        E3.isEnabled = false
        E4.isEnabled = false
        E5.isEnabled = false
        E6.isEnabled = false
        E7.isEnabled = false
        E8.isEnabled = false

        F1.isEnabled = false
        F2.isEnabled = false
        F3.isEnabled = false
        F4.isEnabled = false
        F5.isEnabled = false
        F6.isEnabled = false
        F7.isEnabled = false
        F8.isEnabled = false

        G1.isEnabled = false
        G2.isEnabled = false
        G3.isEnabled = false
        G4.isEnabled = false
        G5.isEnabled = false
        G6.isEnabled = false
        G7.isEnabled = false
        G8.isEnabled = false

        H1.isEnabled = false
        H2.isEnabled = false
        H3.isEnabled = false
        H4.isEnabled = false
        H5.isEnabled = false
        H6.isEnabled = false
        H7.isEnabled = false
        H8.isEnabled = false
    }


    fun onClick(view: View){
        if(view is TextView){
            when(view.text){
//                "P" -> pawnMove(view)
                "R" -> rookMove(view)
                "B" -> bishopMove(view)
                "Kn" -> knightMove(view)
                "Q" -> queenMove(view)
                "K" -> kingMove(view)
                "" -> Move(view)

            }
        }


    }

    fun Move(view: View){
        if(view is TextView){
            view.text = movingPiece


        }
    }

//    fun pawnMove(view: View){
//        if(view is TextView){
//            var a = findId(view)
//
//            disableAll()
//            boardArray[a[0]][a[1]+1].isEnabled = true
//            movingPiece = "P"
//        }
//    }
    fun knightMove(view: View){}
    fun bishopMove(view: View){}
    fun rookMove(view: View){}
    fun queenMove(view: View){}
    fun kingMove(view: View){}

    fun findId(view: View): Array<Int> {
        if(view.id.toString() == H2.toString()){
            return arrayOf(2,8)
        }

        return arrayOf(2,8)
    }

    fun checkChecks(){}

}