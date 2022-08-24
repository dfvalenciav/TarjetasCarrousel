package com.example.tarjetascarrousel.cardCarrousel.data.mappers

import com.example.tarjetascarrousel.cardCarrousel.data.Local.RCardCarrouselEntity
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel

fun RCardCarrouselEntity.toCardCarrousel() = CardCarrousel(bankLogo,bankName, cardNumber, cardExpiration, cardFranchise, cardBackgroud)
fun List<RCardCarrouselEntity>.toRListCardCarrouselTask() = map { data ->
    data.toCardCarrousel() }