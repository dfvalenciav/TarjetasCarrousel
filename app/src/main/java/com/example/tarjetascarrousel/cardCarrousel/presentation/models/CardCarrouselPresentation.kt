package com.example.tarjetascarrousel.cardCarrousel.presentation.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardCarrouselPresentation(
    var bankLogo : String,
    var bankName: String,
    var cardNumber: String,
    var cardExpiration: String,
    var cardFranchise: String,
    var cardBackground: String,
): Parcelable

fun equals (oldItem : CardCarrouselPresentation, newItem: CardCarrouselPresentation) : Boolean =
    oldItem.bankName == newItem.bankName && oldItem.bankLogo == newItem.bankLogo && oldItem.cardNumber == newItem.cardNumber
            && oldItem.cardExpiration == newItem.cardExpiration  && oldItem.cardFranchise == newItem.cardFranchise
