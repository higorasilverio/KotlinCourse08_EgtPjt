package br.com.silverio.kotlincourse08_egtpjt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener{
            val intent = Intent(applicationContext, JogoActivity::class.java)

            val number= Random.nextInt(2)
            intent.putExtra("number", number)
            startActivity(intent)
        }

    }
}
