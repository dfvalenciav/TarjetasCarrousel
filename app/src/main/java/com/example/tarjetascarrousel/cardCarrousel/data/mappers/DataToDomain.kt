package com.example.tarjetascarrousel.cardCarrousel.data.mappers

import com.example.tarjetascarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel

fun RCardCarrousel.toCardCarrousel() = CardCarrousel(bankLogo,bankName, cardNumber, cardExpiration, cardFranchise, cardBackgroud)
fun List<RCardCarrousel>.toRListCardCarrouselTask() = map { data ->
    data.toCardCarrousel() }