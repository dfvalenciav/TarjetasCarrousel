package com.example.tarjetascarrousel.cardCarrousel.presentation.mappers

import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation

fun CardCarrousel.toCardCarrouselPresentation() = CardCarrouselPresentation(BankLogo, BankName, CardNumber, CardExpiration, CardFranchise, CardBackground)
fun List<CardCarrousel>.toListCardCarrouselPresentation() = map {
        domain -> domain.toCardCarrouselPresentation()
}