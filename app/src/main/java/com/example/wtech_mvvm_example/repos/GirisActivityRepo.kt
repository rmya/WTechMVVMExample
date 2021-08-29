package com.example.wtech_mvvm_example.repos

import androidx.lifecycle.MutableLiveData
import com.example.wtech_mvvm_example.models.giris.Kullanici

class GirisActivityRepo {

    var kullaniciData = MutableLiveData<Kullanici ? >()
    var uyelikKontrol = MutableLiveData<Int>()

    init{
        kullaniciData = MutableLiveData()
        uyelikKontrol = MutableLiveData()
    }

    fun kullaniciDataGetir() : MutableLiveData<Kullanici ?>{
        return kullaniciData
    }

    fun uyelikKontrolGetir() : MutableLiveData<Int>{
        return uyelikKontrol
    }

    fun girisYapRepo(adSoyad:String, mailAdres:String, sifre:String){

        if(adSoyad =="Rumeysa Tan" && mailAdres=="rumeysa.tan2@gmail.com" && sifre =="rt123"){
            kullaniciData.value = Kullanici(adSoyad,mailAdres,sifre)
        }   else{
            kullaniciData.value = null
        }
    }

    fun uyeOlRepo(adSoyad: String, mailAdres: String, sifre: String){

        if (adSoyad != "" && mailAdres !="" && sifre !=""){
            uyelikKontrol.value = 1
        }   else{
            uyelikKontrol.value = 0
        }
    }


}