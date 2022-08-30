package com.example.tarjetascarrousel.cardCarrousel.presentation.cardCarrousel

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel
import androidx.fragment.app.viewModels
import com.example.daval.cleanrecyclerview.Utils.Utils
import com.example.tarjetascarrousel.R
import com.example.tarjetascarrousel.cardCarrousel.base.BaseFragment
import com.example.tarjetascarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation
import com.example.tarjetascarrousel.databinding.FragmentCardCarrouselBinding
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.fragment_card_carrousel.*

class CardCarrouselFragment :  BaseFragment<FragmentCardCarrouselBinding, CardCarrouselViewModel>() {

    var colors = intArrayOf(
        Color.parseColor("#FFBB86FC"),
        Color.parseColor("#FF3700B3"),
        Color.parseColor("#000000"),
        Color.parseColor("#FF018786"),
        Color.parseColor("#e8c227"),
        Color.parseColor("#000C66"),
        Color.parseColor("#EADDCA"),
        Color.parseColor("#01579b")
    )

    override val viewModel by viewModels<CardCarrouselViewModel> ()
    private lateinit var itemsCarrousel : List<CardCarrouselPresentation>


    override fun inflateView(
        inflater: LayoutInflater,
        container: ViewGroup?
    )= FragmentCardCarrouselBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getCardCarrouselList()
        //setupCarousel()

    }

    override fun observe() {
        viewModel.event.observe(viewLifecycleOwner){ event ->
            when (event) {
                is CardCarrouselEvent.ListCardCarrousel -> {
                    itemsCarrousel = event.ls_carrousel
                    setupCarousel()
                }
            }
        }
    }
    private fun setupCarousel() {
        val carousel = binding.carouselCards
        binding.motionLayout.visibility = View.VISIBLE
        binding.progressBarCarrouselCards.visibility = View.INVISIBLE
        val numCards = itemsCarrousel.size//colors.size
        carousel.setAdapter(object : Carousel.Adapter {
            override fun count(): Int {
                return numCards
            }
            override fun populate(view: View, index: Int) {
                binding.progressBarCarrouselCards.visibility= View.INVISIBLE
                binding.motionLayout.visibility = View.VISIBLE
                val indexCard = itemsCarrousel[index]
                val util = Utils()
                if (view is MaterialCardView) {
                    view.setBackgroundColor(colors[index])
                    textViewCardNumberOne.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewCardNumberTwo.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewCardNumberThree.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewBankNameTwo.text = indexCard.bankName
                    textViewBankNameOne.text = indexCard.bankName
                    textViewBankNameThree.text = indexCard.bankName
                    textViewCardExpirationOne.text = indexCard.cardExpiration
                    textViewCardExpirationTwo.text = indexCard.cardExpiration
                    textViewCardExpirationThree.text = indexCard.cardExpiration
                    imageViewFranchise1.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                    imageViewFranchise2.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                    imageViewFranchise3.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                }
            }

            override fun onNewItem(index: Int) {
                val indexCard = itemsCarrousel[index]
                val util = Utils()
                if (view is MaterialCardView) {
                    (view as MaterialCardView).setBackgroundColor(colors[index])
                    textViewCardNumberOne.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewCardNumberTwo.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewCardNumberThree.text = util.hideCardNumber(indexCard.cardNumber)
                    textViewBankNameTwo.text = indexCard.bankName
                    textViewCardExpirationOne.text = indexCard.cardExpiration
                    textViewCardExpirationTwo.text = indexCard.cardExpiration
                    textViewCardExpirationThree.text = indexCard.cardExpiration
                    imageViewFranchise1.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                    imageViewFranchise2.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                    imageViewFranchise3.setImageResource(resources.getIdentifier(indexCard.cardFranchise, "drawable","com.example.daval.cleanrecyclerview"))
                }
            }
        })
        carousel.refresh()
    }
}