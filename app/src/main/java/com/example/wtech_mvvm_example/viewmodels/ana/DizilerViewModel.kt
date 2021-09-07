package com.example.wtech_mvvm_example.viewmodels.ana

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wtech_mvvm_example.models.ana.Dizi
import com.example.wtech_mvvm_example.repos.AnaActivityRepo

class DizilerViewModel : ViewModel(){

    val anaDepo = AnaActivityRepo()
    var dizilerData = MutableLiveData<ArrayList<Dizi ? >>()

    init {
        dizilerData = anaDepo.diziDataGetir()
    }

    fun diziYukleVM(dizilerListe: ArrayList<Dizi ?>){
        anaDepo.diziYukleRepo(dizilerListe)
    }


}