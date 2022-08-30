package com.example.tarjetascarrousel.cardCarrousel.presentation.cardCarrousel

import com.example.tarjetascarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation

sealed class CardCarrouselEvent {
    class ListCardCarrousel (val ls_carrousel: List<CardCarrouselPresentation>) : CardCarrouselEvent()
}