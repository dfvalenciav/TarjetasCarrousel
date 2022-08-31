package com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet

import com.example.tarjetascarrousel.cardCarrousel.base.BaseViewModel
import com.example.tarjetascarrousel.cardCarrousel.domain.useCase.GetCardCarrouselUseCase
import com.example.tarjetascarrousel.cardCarrousel.presentation.mappers.toListTransactionPresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CardBottomSheetViewModel @Inject constructor(
    private val getCardCarrouselUseCase: GetCardCarrouselUseCase
): BaseViewModel<TransactionEvent>(){

    fun getTransactionList(){
        executeUseCase(
            {
                getCardCarrouselUseCase.execute()
            },
            {
                getCardCarrouselUseCase ->
                getCardCarrouselUseCase.toListTransactionPresentation()
                    .also{ presentationTransactionList ->
                        _event.value = TransactionEvent.ListTransaction(presentationTransactionList)
                    }
            }
        )
    }
}