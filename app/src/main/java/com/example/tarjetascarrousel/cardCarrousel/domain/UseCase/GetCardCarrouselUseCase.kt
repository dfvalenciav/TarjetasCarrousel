package com.example.tarjetascarrousel.cardCarrousel.domain.UseCase

import com.example.tarjetascarrousel.cardCarrousel.base.BaseUseCase
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardRealmRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import javax.inject.Inject

class GetCardCarrouselUseCase @Inject constructor(
    private val repository: ICardRealmRepository
) : BaseUseCase<CardCarrousel>(){
    override suspend fun execute(): List<CardCarrousel> {
        return repository.getCardListCarrouselObjects()
    }
}