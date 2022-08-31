package com.example.tarjetascarrousel


import android.view.LayoutInflater
import androidx.navigation.findNavController
import com.example.tarjetascarrousel.cardCarrousel.base.BaseActivity
import com.example.tarjetascarrousel.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding> (){
    override fun inflateView(inflater: LayoutInflater) =
        ActivityMainBinding.inflate(inflater)

    override fun setUI() {
        binding.navHostFragment.findNavController()
            .setGraph(R.navigation.navigation)
    }

}