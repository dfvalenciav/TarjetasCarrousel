package com.example.tarjetascarrousel.cardCarrousel.data.mappers

import com.example.tarjetascarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import java.util.*

fun CardCarrousel.toRCardCarrousel() = RCardCarrousel(bankLogo,bankName,cardNumber,cardExpiration,cardFranchise, cardBackground, UUID.randomUUID().mostSignificantBits)
fun List<CardCarrousel>.toRListCardCarrousel()= map {domain ->
    domain.toRCardCarrousel()
}