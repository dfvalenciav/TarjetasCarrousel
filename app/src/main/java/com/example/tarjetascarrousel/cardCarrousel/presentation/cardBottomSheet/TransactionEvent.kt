package com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet

import com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet.models.TransactionPresentation

sealed class TransactionEvent {
    class ListTransaction(val ls: List<TransactionPresentation>) : TransactionEvent()
}