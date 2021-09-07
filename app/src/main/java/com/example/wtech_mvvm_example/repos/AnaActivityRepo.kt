package com.example.wtech_mvvm_example.repos

import androidx.lifecycle.MutableLiveData
import com.example.wtech_mvvm_example.models.ana.Dizi
import com.example.wtech_mvvm_example.models.ana.Film

class AnaActivityRepo {

    var filmlerData = MutableLiveData<ArrayList<Film ? >>()
    var dizilerData = MutableLiveData<ArrayList<Dizi ? >>()

    init {
        filmlerData = MutableLiveData()
        dizilerData = MutableLiveData()
    }

    fun filmlerDataGetir() : MutableLiveData<ArrayList<Film ? >>{
        return filmlerData
    }

    fun filmYukleRepo(filmlerListe : ArrayList<Film ? >){
        filmlerData.value = filmlerListe
    }

    fun diziDataGetir() : MutableLiveData<ArrayList<Dizi?>>{
        return dizilerData
    }

    fun diziYukleRepo(dizilerListe : ArrayList<Dizi ? >){
        dizilerData.value = dizilerListe
    }
}