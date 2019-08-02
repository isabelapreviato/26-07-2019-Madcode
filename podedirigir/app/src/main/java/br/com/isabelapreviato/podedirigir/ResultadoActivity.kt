package br.com.isabelapreviato.podedirigir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.getStringExtra("nome")

        txvAloha.text = "A L O H A,  $nome"

        var listaIdades = arrayListOf<Int>()

        for(idade in 1..100){
            listaIdades.add(idade)
        }

        var idadeAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaIdades)

        spnIdades.adapter = idadeAdapter


        btnClique.setOnClickListener {
            var idadeSelecionada = spnIdades.selectedItem as Int

            if(idadeSelecionada>=18){
                txvResultado.text = "Pode dirigir!"
            }

            else{
                txvResultado.text = "Não pode dirigir!"
            }
        }
    }
}
