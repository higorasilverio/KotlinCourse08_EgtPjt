package br.com.silverio.kotlincourse08_egtpjt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jogo.*

class JogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)

        val data: Bundle? = intent.extras
        val number = data?.getInt("number")



        if (number == 0) image_flip.setImageResource(R.drawable.moeda_cara)
        else image_flip.setImageResource(R.drawable.moeda_coroa)

        button_voltar.setOnClickListener{
            finish()
        }
    }
}
