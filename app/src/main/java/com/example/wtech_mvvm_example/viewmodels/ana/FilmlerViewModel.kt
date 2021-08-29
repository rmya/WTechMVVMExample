package com.example.wtech_mvvm_example.viewmodels.ana

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wtech_mvvm_example.models.ana.Film
import com.example.wtech_mvvm_example.repos.AnaActivityRepo
import java.util.ArrayList

class FilmlerViewModel : ViewModel(){

    val anaRepo = AnaActivityRepo()
    var filmlerData = MutableLiveData<ArrayList<Film?>>()

    init {
        filmlerData = anaRepo.filmlerDataGetir()
    }

    fun filmYukleVM(filmlerListe: ArrayList<Film?>) {
        anaRepo.filmYukleRepo(filmlerListe)
    }

}