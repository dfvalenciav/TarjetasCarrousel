package com.example.tarjetascarrousel.cardCarrousel.data.mappers


import com.example.tarjetascarrousel.cardCarrousel.data.local.entity.TransactionRealm
import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction
import java.util.*


fun Transaction.toTransactionRealm() =
    TransactionRealm(date, name, amount, UUID.randomUUID().mostSignificantBits)

fun List<Transaction>.toListTransaction() = map { domain ->
    domain.toTransactionRealm()
}