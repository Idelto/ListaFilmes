package com.trash2money.listafilmes.model

import android.os.Parcel
import android.os.Parcelable
import com.trash2money.listafilmes.R

data class Filmes(
    val img: Int,
    val imgdetail: Int,
    val nome: String?,
    val genero: String?,
    val classificacao: String?,
    val sinopse: Int,
    val lancamento: String?,
    val tempo: String?,
    val link: String?,
    val criticaFa: String?,
    val criticaPro: String?,
    val nota: String?,
    val diretor: String?,
    val atores: String?,
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(img)
        parcel.writeInt(imgdetail)
        parcel.writeString(nome)
        parcel.writeString(genero)
        parcel.writeString(classificacao)
        parcel.writeInt(sinopse)
        parcel.writeString(lancamento)
        parcel.writeString(tempo)
        parcel.writeString(link)
        parcel.writeString(criticaFa)
        parcel.writeString(criticaPro)
        parcel.writeString(nota)
        parcel.writeString(diretor)
        parcel.writeString(atores)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Filmes> {
        override fun createFromParcel(parcel: Parcel): Filmes {
            return Filmes(parcel)
        }

        override fun newArray(size: Int): Array<Filmes?> {
            return arrayOfNulls(size)
        }
    }
}

class FilmesBuilder {
    var img = 0
    var imgdetail = 0
    var nome = ""
    var genero = ""
    var classificacao = ""
    var sinopse = 0
    var lancamento = ""
    var tempo = ""
    var link = ""
    var criticaFa = ""
    var criticaPro = ""
    var nota = ""
    var diretor = ""
    var atores = ""

    fun build(): Filmes =
        Filmes(img, imgdetail, nome, genero, classificacao, sinopse, lancamento, tempo, link, criticaFa, criticaPro, nota, diretor, atores)

}

fun filmes(block: FilmesBuilder.() -> Unit): Filmes = FilmesBuilder().apply(block).build()

fun initFilmes(): MutableList<Filmes> = mutableListOf(
    filmes {
        img = R.mipmap.ic_launcher_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "O Regresso"
        genero = "Faroeste, Aventura, Drama"
        classificacao = "+16"
        sinopse = R.string.o_regresso_sinopse
        lancamento = "2016"
        tempo = "2h 36min"
        link =
            "https://www.primevideo.com/detail/0LCPYMTJRK4TS7ST1O9E5NQQWF/ref=atv_mv_hom_c_hUwnRJ_brws_8_3"
        criticaFa = "84%"
        criticaPro = "78%"
        nota = "7.8/10"
        diretor = "Alejandro Inarritu"
        atores = "Leonardo Dicaprio, Tom Hardy, Domhnall Gleeson"
    }, filmes {
        img = R.mipmap.gladiador_foreground
        imgdetail = R.mipmap.gladiador_foreground
        nome = "Gladiador"
        genero = "Ação, Histórico, Drama"
        classificacao = "+14"
        sinopse = R.string.gladiador_sinopse
        lancamento = "2000"
        tempo = "2h 34min"
        link =
            "https://www.primevideo.com/detail/0I9W28WNYJE1W14IIK4D3UP4M3/ref=atv_mv_hom_c_hUwnRJ_brws_8_1"
        criticaFa = "87%"
        criticaPro = "77%"
        nota = "7.7/10"
        diretor = "Ridley Scott"
        atores = "Chris Kell, David Hemmings, David Schofield"
    }, filmes {
        img = R.mipmap.bastardos_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "Bastardos Inglórios"
        genero = "Ação, Drama"
        classificacao = "+18"
        sinopse = R.string.bastardos_inglorios_sinopse
        lancamento = "2009"
        tempo = "2h 32min"
        link =
            "https://www.primevideo.com/detail/0OO2I8SGWJ128GHUY1404Z1V5P/ref=atv_mv_hom_c_hUwnRJ_brws_8_5"
        criticaFa = "88%"
        criticaPro = "89%"
        nota = "8.9/10"
        diretor = "Quentin Tarantino"
        atores = "Brad Pitt, Mélanie Laurent, Christoph Waltz"
    }, filmes {
        img = R.mipmap.odiados8_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "Os Oito Odiados"
        genero = "Suspense"
        classificacao = "+18"
        sinopse = R.string.oito_odiados_sinopse
        lancamento = "2015"
        tempo = "2h 47min"
        link =
            "https://www.primevideo.com/detail/0M2D45PKENB97OPCP8LRJLK44F/ref=atv_sr_def_c_unkc__2_1_2?sr=1-2&pageTypeIdSource=ASIN&pageTypeId=B081M26H7F&qid=1618523834"
        criticaFa = "74%"
        criticaPro = "76%"
        nota = "7.6/10"
        diretor = "Quentin Tarantino"
        atores = "Michael Madsen, Bruce Dern, Tim Roth"
    }, filmes {
        img = R.mipmap.prendame_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "Prenda-Me Se For Capaz"
        genero = "Drama"
        classificacao = "+12"
        sinopse = R.string.prendame_seforcapaz_sinopse
        lancamento = "2002"
        tempo = "2h 20min"
        link =
            "https://www.primevideo.com/detail/0T1RKA5DY5Z7YSQ3XG4W1F47CG/ref=atv_sr_def_c_unkc__1_1_1?sr=1-1&pageTypeIdSource=ASIN&pageTypeId=B01N2OUDZF&qid=1618524418"
        criticaFa = "96%"
        criticaPro = "89%"
        nota = "8.9/10"
        diretor = "Steven Spielberg"
        atores = "Leonardo DiCaprio, Tom Hanks, Christopher Walken"
    }, filmes {
        img = R.mipmap.portais9_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "O Último Portal"
        genero = "Suspense"
        classificacao = "+16"
        sinopse = R.string.ultimo_portal_sinopse
        lancamento = "1999"
        tempo = "2h 13min"
        link =
            "https://www.primevideo.com/detail/0T64532D70U7XLFLHJY962ZSXD/ref=atv_sr_def_c_unkc__8_1_8?sr=1-8&pageTypeIdSource=ASIN&pageTypeId=B086P9JDMD&qid=1618524418"
        criticaFa = "44%"
        criticaPro = "57%"
        nota = "5.7/10"
        diretor = "Roman Polanski"
        atores = "Johnny Depp, Lena Olin, Frank Langella"
    }, filmes {
        img = R.mipmap.johnwick_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "John Wick"
        genero = "Ação"
        classificacao = "+16"
        sinopse = R.string.john_wick_sinopse
        lancamento = "2014"
        tempo = "2h 14min"
        link =
            "https://www.primevideo.com/detail/0PZ1Q2RV0FRLPFEHAE4WGBICPK/ref=atv_mv_hom_c_wWdN7k_brws_11_4"
        criticaFa = "86%"
        criticaPro = "81%"
        nota = "8.1/10"
        diretor = "Chad Stahelski"
        atores = "Keanu Reeves, Willem Dafoe, John Leguizamo"
    }, filmes {
        img = R.mipmap.distrito_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "13º Distrito"
        genero = "Drama, Ação"
        classificacao = "+16"
        sinopse = R.string.o13_distrito_sinopse
        lancamento = "2014"
        tempo = "1h 30min"
        link =
            "https://www.primevideo.com/detail/0HKDYOED4V0SCFCD1PBU4Z2SG5/ref=atv_mv_hom_c_sLKNN8_brws_17_3"
        criticaFa = "26%"
        criticaPro = "47%"
        nota = "4.7/10"
        diretor = "Camille Delamarre"
        atores = "Paul Walker, RZA, David Belle"
    }, filmes {
        img = R.mipmap.imortais_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "Imortais"
        genero = "Fantasia, Drama, Ação"
        classificacao = "+12"
        sinopse = R.string.imortais_sinopse
        lancamento = "2011"
        tempo = "1h 50min"
        link =
            "https://www.primevideo.com/detail/0O73Y3UL7958DDIT702N1HHOVS/ref=atv_sr_def_c_unkc__1_1_1?sr=1-1&pageTypeIdSource=ASIN&pageTypeId=B08C4RVMJT&qid=1618525286"
        criticaFa = "46%"
        criticaPro = "48%"
        nota = "4.8/10"
        diretor = "Tarsem Singh"
        atores = "Henry Cavill, Mickey Rourke, Luke Evans"
    }, filmes {
        img = R.mipmap.rambo_foreground
        imgdetail = R.mipmap.ic_launcher
        nome = "Rambo IV"
        genero = "Ação"
        classificacao = "+18"
        sinopse = R.string.Rambo4_sinopse
        lancamento = "2008"
        tempo = "1h 30min"
        link =
            "https://www.primevideo.com/detail/0R9XBJG733V5VFOH3XXTMK2QKD/ref=atv_sr_def_c_unkc__17_1_17?sr=1-17&pageTypeIdSource=ASIN&pageTypeId=B084ZZDG5G&qid=1618525286"
        criticaFa = "37%"
        criticaPro = "69%"
        nota = "6.9/10"
        diretor = "Sylvester Stallone"
        atores = "Sylvester Stallone, Matthew Marsden, Julie Benz"
    }
)