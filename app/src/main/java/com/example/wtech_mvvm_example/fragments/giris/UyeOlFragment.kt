package com.example.wtech_mvvm_example.fragments.giris

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.wtech_mvvm_example.R
import com.example.wtech_mvvm_example.databinding.FragmentUyeOlBinding
import com.example.wtech_mvvm_example.viewmodels.giris.UyeOlViewModel
import com.google.android.material.snackbar.Snackbar

class UyeOlFragment : Fragment() {

    private lateinit var binding : FragmentUyeOlBinding
    private val viewModel : UyeOlViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_uye_ol,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.uyeOlFragmentObject = this

        viewModel.uyelikKontrol.observe(viewLifecycleOwner,{

            if(it == 1){
                geriDonus()
                Snackbar.make(view,"Kayıt başarıyla oluşturuldu",1500).show()
            }   else{
                Snackbar.make(view,"Eksik bilgi girildi",1500).show()
            }
        })

    }

    fun geriDonus(){
        findNavController().navigate(R.id.action_uyeOlFragment_to_girisYapFragment)
    }

    fun uyeOl(adSoyad:String, mailAdres:String,sifre:String){
        viewModel.uyeOlVM(adSoyad,mailAdres,sifre)
    }

}