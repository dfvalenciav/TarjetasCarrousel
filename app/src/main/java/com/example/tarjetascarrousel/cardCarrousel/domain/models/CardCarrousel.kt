package com.example.tarjetascarrousel.cardCarrousel.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardCarrousel(
    val bankLogo : String,
    val bankName: String,
    val cardNumber: String,
    val cardExpiration: String,
    val cardFranchise: String,
    val cardBackground: String,
) : Parcelable