package com.example.displaytoyslist

import ToyBox
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pegando a referencia ao textview
        val mTaysListTextView = tv_toy_names
        //pegando a referencia ao objeto ToyBox
        val Toy = ToyBox

        //pegando a lista dos brinquedos
        val brinquedos = Toy.toyNames

        //varrendo a lista de brinquedos
        for (brinquedo in brinquedos) {
            //atribuindo um brinquedo a lista
            mTaysListTextView.append(brinquedo + "\n\n\n")
        }
    }
}