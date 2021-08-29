package com.example.wtech_mvvm_example.viewmodels.giris

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wtech_mvvm_example.models.giris.Kullanici
import com.example.wtech_mvvm_example.repos.GirisActivityRepo

class GirisYapViewModel : ViewModel() {

    val girisRepo = GirisActivityRepo()
    var kullaniciData = MutableLiveData<Kullanici?>()

    init {
        kullaniciData = girisRepo.kullaniciDataGetir()
    }

    fun girisYapVM(adSoyad: String, mailAdres: String, sifre: String) {
        girisRepo.girisYapRepo(adSoyad, mailAdres, sifre)
    }

}