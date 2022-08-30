package com.example.tarjetascarrousel.cardCarrousel.data.repository

import com.example.tarjetascarrousel.cardCarrousel.data.interfaces.IRealmDataBase
import com.example.tarjetascarrousel.cardCarrousel.data.local.MockDataBase
import com.example.tarjetascarrousel.cardCarrousel.data.mappers.toRListCardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.data.mappers.toRListCardCarrouselTask
import com.example.tarjetascarrousel.cardCarrousel.data.models.RCardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.domain.interfaces.ICardRealmRepository
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import io.realm.kotlin.where
import javax.inject.Inject

class CardRealmRepository @Inject constructor(private val realmDataBase: IRealmDataBase) :
    ICardRealmRepository {

    private val mockDataBase by lazy { MockDataBase() }

    override suspend fun getCardListCarrouselObjects(): List<CardCarrousel> {
        insertCardListCarrousel(mockDataBase.cardListCarrousel())
        return realmDataBase.getObjectsFromRealm { where<RCardCarrousel>().findAll() }.toRListCardCarrouselTask()
    }

    override suspend fun insertCardListCarrousel(cardCarrousel: List<CardCarrousel>) {
        realmDataBase.deleteAllObjectFromRealm { RCardCarrousel() }
        return realmDataBase.addObjectFromRealm { cardCarrousel.sortedBy { it.bankName }.toRListCardCarrousel() }
    }
}