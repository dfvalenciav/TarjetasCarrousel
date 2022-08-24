package com.example.tarjetascarrousel.cardCarrousel.domain.UseCase

import com.example.tarjetascarrousel.cardCarrousel.base.BaseUseCase
import com.example.tarjetascarrousel.cardCarrousel.data.CardRealmRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel

class GetCardCarrouselUseCase (private val repository: CardRealmRepository) : BaseUseCase<CardCarrousel>(){
    override suspend fun execute(): List<CardCarrousel> {
        return repository.getCardListCarrouselObjects()
    }
}