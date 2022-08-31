package com.example.tarjetascarrousel.cardCarrousel.presentation.mappers

import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction
import com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet.models.TransactionPresentation


fun Transaction.toTransactionPresentation() = TransactionPresentation(date, name, amount)

fun List<Transaction>.toListTransactionPresentation() = map{domain ->
    domain.toTransactionPresentation()
}