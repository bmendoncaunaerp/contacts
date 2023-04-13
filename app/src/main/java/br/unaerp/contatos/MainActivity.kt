package br.unaerp.contatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavega: Button = findViewById(R.id.btnNavega)
        btnNavega.setOnClickListener {
            val navegaParaOutraTela = Intent(this, DetailActivity::class.java)
            startActivity(navegaParaOutraTela)
        }
    }
}






