package com.example.tarjetascarrousel.cardCarrousel.presentation.cardCarrousel

import com.example.tarjetascarrousel.cardCarrousel.base.BaseViewModel
import com.example.tarjetascarrousel.cardCarrousel.domain.UseCase.GetCardCarrouselUseCase
import com.example.tarjetascarrousel.cardCarrousel.presentation.mappers.toListCardCarrouselPresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardCarrouselViewModel @Inject constructor(
    private val getCardCarrouselUseCase: GetCardCarrouselUseCase
): BaseViewModel<CardCarrouselEvent>(){

    fun getCardCarrouselList () {
        executeUseCase(
            {
                getCardCarrouselUseCase.execute()
            },
            { getCardCarrouselUseCase ->
                getCardCarrouselUseCase.toListCardCarrouselPresentation()
                    .also {
                            presentationCardListCarrousel ->
                        _event.value = CardCarrouselEvent.ListCardCarrousel(presentationCardListCarrousel)
                    }
            }
        )
    }
}