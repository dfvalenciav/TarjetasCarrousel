package com.example.tarjetascarrousel.cardCarrousel.data.mappers

import com.example.tarjetascarrousel.cardCarrousel.data.Local.RCardCarrouselEntity
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import java.util.*

fun CardCarrousel.toRCardCarrouselEntity() = RCardCarrouselEntity(BankLogo,BankName,CardNumber,CardExpiration,CardFranchise, CardBackground, UUID.randomUUID().mostSignificantBits)
fun List<CardCarrousel>.toRListCardCarrouselEntity()= map {domain ->
    domain.toRCardCarrouselEntity()
}