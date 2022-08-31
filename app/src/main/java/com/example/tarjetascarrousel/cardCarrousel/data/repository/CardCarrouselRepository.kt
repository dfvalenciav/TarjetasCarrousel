package com.example.tarjetascarrousel.cardCarrousel.data.repository

import com.example.tarjetascarrousel.cardCarrousel.data.interfaces.IRealmDatabase
import com.example.tarjetascarrousel.cardCarrousel.data.local.MockDataBase
import com.example.tarjetascarrousel.cardCarrousel.data.local.entity.TransactionRealm
import com.example.tarjetascarrousel.cardCarrousel.data.mappers.toListTransaction
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardCarrouselRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.models.Transaction
import io.realm.kotlin.where
import javax.inject.Inject

class CardCarrouselRepository @Inject constructor(
    private val realmDataBase: IRealmDatabase
) : ICardCarrouselRepository {


    private val mockDataBase by lazy { MockDataBase() }


    override suspend fun getListTransaction(): List<Transaction> {
        insertListTransaction(mockDataBase.transaction())
        return realmDataBase.getObjectsFromRealm { where<TransactionRealm>().findAll() }.toListTransaction()
    }

    override suspend fun insertListTransaction(transaction: List<Transaction>) {
        realmDataBase.deleteAllObjectFromRealm { TransactionRealm() }
        return realmDataBase.addObjectFromRealm { transaction.toListTransaction() }
    }


}