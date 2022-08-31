package com.example.tarjetascarrousel.cardCarrousel.data.mappers

import com.example.tarjetascarrousel.cardCarrousel.data.local.entity.TransactionRealm
import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction


fun TransactionRealm.toTransaction()=Transaction(date, name, amount)

fun List<TransactionRealm>.toListTransaction() = map { data -> data.toTransaction() }


