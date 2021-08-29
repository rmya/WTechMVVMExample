package com.example.wtech_mvvm_example.repos

import androidx.lifecycle.MutableLiveData
import com.example.wtech_mvvm_example.models.ana.Film

class AnaActivityRepo {

    var filmlerData = MutableLiveData<ArrayList<Film ? >>()

    init {
        filmlerData = MutableLiveData()
    }

    fun filmlerDataGetir() : MutableLiveData<ArrayList<Film ? >>{
        return filmlerData
    }

    fun filmYukleRepo(filmlerListe : ArrayList<Film ? >){
        filmlerData.value = filmlerListe
    }
}