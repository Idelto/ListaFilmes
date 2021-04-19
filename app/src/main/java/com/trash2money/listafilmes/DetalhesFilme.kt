package com.trash2money.listafilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trash2money.listafilmes.model.Filmes
import kotlinx.android.synthetic.main.activity_detalhes_filme.*

class DetalhesFilme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_filme)

        val filmeDetail = intent?.getParcelableExtra<Filmes>("filmes")

        txt_nome_filme_detail.text = filmeDetail?.nome
        img_filme_detail.setImageResource(filmeDetail!!.img)
        txt_details_filme.text = "${filmeDetail.tempo} • ${filmeDetail.lancamento} • ${filmeDetail.classificacao}"
        txt_diretores_filme_detail.text = "Diretores ${filmeDetail.diretor}"
        txt_atores_filme_detail.text = "Atores ${filmeDetail.atores}"
        txt_genero_filme_detail.text = "Gêneros ${filmeDetail.genero}"
        txt_rotten_prof.text = "${filmeDetail.criticaPro}"
        txt_rotten_pub.text = "${filmeDetail.criticaFa}"
        txt_sinopse_scroll.setText(filmeDetail.sinopse) //= "${filmeDetail.sinopse.toString()}"


    }
}