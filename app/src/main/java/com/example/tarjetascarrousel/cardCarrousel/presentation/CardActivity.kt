package com.example.tarjetascarrousel.cardCarrousel.presentation


import android.view.LayoutInflater
import androidx.navigation.findNavController
import com.example.tarjetascarrousel.R
import com.example.tarjetascarrousel.cardCarrousel.base.BaseActivity
import com.example.tarjetascarrousel.databinding.ActivityCardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CardActivity : BaseActivity<ActivityCardBinding>() {

    override fun inflateView(inflater: LayoutInflater) =
        ActivityCardBinding.inflate(inflater)

    override fun setUI() {
        binding.navHostFragment.findNavController()
            .setGraph(R.navigation.navigation_card)
    }
}
