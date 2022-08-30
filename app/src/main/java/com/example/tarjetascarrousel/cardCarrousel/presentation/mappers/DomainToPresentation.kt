package com.example.tarjetascarrousel.cardCarrousel.presentation.mappers

import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation

fun CardCarrousel.toCardCarrouselPresentation() = CardCarrouselPresentation(bankLogo, bankName, cardNumber, cardExpiration, cardFranchise, cardBackground)
fun List<CardCarrousel>.toListCardCarrouselPresentation() = map {
        domain -> domain.toCardCarrouselPresentation()
}