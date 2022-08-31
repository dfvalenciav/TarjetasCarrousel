package com.example.tarjetascarrousel.cardCarrousel.domain.useCase

import com.example.tarjetascarrousel.cardCarrousel.base.BaseUseCase
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardCarrouselRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction
import javax.inject.Inject

class GetCardCarrouselUseCase @Inject constructor(
    private val repository: ICardCarrouselRepository
):BaseUseCase<Transaction>(){

    override suspend fun execute(): List<Transaction> {
        return repository.getListTransaction()
    }
}