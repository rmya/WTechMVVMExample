package com.example.wtech_mvvm_example.fragments.giris

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.wtech_mvvm_example.R
import com.example.wtech_mvvm_example.activity.AnaActivity
import com.example.wtech_mvvm_example.databinding.FragmentGirisYapBinding
import com.example.wtech_mvvm_example.viewmodels.giris.GirisYapViewModel
import com.google.android.material.snackbar.Snackbar

class GirisYapFragment : Fragment() {

    private lateinit var binding: FragmentGirisYapBinding
    private val viewModel: GirisYapViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_giris_yap, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.girisYapFragmentObject = this

        val preference = requireActivity().getSharedPreferences(
            "com.example.wtech_mvvm_example",    //paketin her yerinden erişilebilir
            Context.MODE_PRIVATE    //sadece projeden erişim için
        )
        val editor = preference.edit()

        viewModel.kullaniciData.observe(viewLifecycleOwner, {

            if (it == null) {
                Snackbar.make(view, "Kullanici bulunamadi", 1500).show()
            } else {
                editor.putString("adsoyad", it.adSoyad) //db den gelen veri gibi
                editor.putString("mailadres", it.mailAdres)
                editor.apply()

                val intent = Intent(requireActivity(), AnaActivity::class.java)
                startActivity(intent)
            }
        })


    }

    fun girisYap(adSoyad: String, mailAdres: String, sifre: String) {
        viewModel.girisYapVM(adSoyad, mailAdres, sifre)
    }

    fun uyeOlGecis(){
        findNavController().navigate(R.id.action_girisYapFragment_to_uyeOlFragment)
    }

}