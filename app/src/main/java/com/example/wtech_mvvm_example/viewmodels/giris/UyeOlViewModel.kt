package com.example.wtech_mvvm_example.viewmodels.giris

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wtech_mvvm_example.repos.GirisActivityRepo

class UyeOlViewModel:ViewModel() {

    val girisRepo = GirisActivityRepo()
    var uyelikKontrol = MutableLiveData<Int>()

    init {
        uyelikKontrol = girisRepo.uyelikKontrolGetir()
    }

    fun uyeOlVM(adSoyad: String, mailAdres: String, sifre: String) {
        girisRepo.uyeOlRepo(adSoyad, mailAdres, sifre)
    }

}