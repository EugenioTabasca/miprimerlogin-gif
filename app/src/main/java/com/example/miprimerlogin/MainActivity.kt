package com.example.miprimerlogin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        botoningresar.setOnClickListener(this)

        }

    private fun validate() :Boolean{
        if (unsernameinput.text.toString().isEmpty()){
            unsernameinput.error = "el nombre no debe estar en blanco"
            return false
        }else if (passwordinput.text.toString().isEmpty()){
            passwordinput.error ="La contraseña no debe estar en blanco"
            return false
        }
        return true
    }
    override fun onClick(v: View?) {
        val usernameinput1 = unsernameinput.text.toString()
        val passwordinput1 = passwordinput.text.toString()
        if (validate())
       if (usernameinput1 == "leo" && passwordinput1 == "12345"){
            val intento = Intent(this,MainActivity2::class.java)
            startActivity(intento)
        }else{
            Toast.makeText(this,"Usuario o Contraseña Erronea",Toast.LENGTH_LONG).show()
        }

    }

  }




