package com.trash2money.listafilmes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trash2money.listafilmes.adapter.FilmesAdapter
import com.trash2money.listafilmes.model.initFilmes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: FilmesAdapter
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        assistir_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(adapter.filmes[position].link))
            startActivity(intent)
        }

        info_btn.setOnClickListener {
            val intent = Intent(this,DetalhesFilme::class.java)
            intent.putExtra("filmes",adapter.filmes[position])

            startActivity(intent)
        }
        

        adapter = FilmesAdapter(initFilmes())
        recycleview_manager.adapter = adapter
        recycleview_manager.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycleview_manager.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    position = getCurrentItem()
                    txt_ano_filme.text = adapter.filmes[position].lancamento
                    txt_nome_filme.text = adapter.filmes[position].nome
                    txt_tema_filme.text = adapter.filmes[position].genero
                    classificacao_filme.text = adapter.filmes[position].classificacao
                    nota_filme.text = adapter.filmes[position].nota
                    img_background.setImageResource(adapter.filmes[position].img)
                }
            }
        })


    }

    private fun getCurrentItem(): Int {
        return (recycleview_manager.getLayoutManager() as LinearLayoutManager).findFirstVisibleItemPosition()
    }
}