package com.example.tarjetascarrousel.cardCarrousel.domain.interfaces

import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction

interface ICardCarrouselRepository {

    suspend fun getListTransaction():List<Transaction>
    suspend fun insertListTransaction(transaction: List<Transaction>)
}