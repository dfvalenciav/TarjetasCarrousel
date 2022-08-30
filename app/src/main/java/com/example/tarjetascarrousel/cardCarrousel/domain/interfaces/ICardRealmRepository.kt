package com.example.tarjetascarrousel.cardCarrousel.domain.interfaces

import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel

interface ICardRealmRepository {
    suspend fun getCardListCarrouselObjects(): List<CardCarrousel>
    suspend fun insertCardListCarrousel(cardCarrousel: List<CardCarrousel>)
}