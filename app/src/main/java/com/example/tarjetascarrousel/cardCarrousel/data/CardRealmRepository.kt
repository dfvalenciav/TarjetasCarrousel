package com.example.tarjetascarrousel.cardCarrousel.data

import android.content.Context
import com.example.tarjetascarrousel.cardCarrousel.data.Interfaces.IRealmDataBase
import com.example.tarjetascarrousel.cardCarrousel.data.Local.BizumDataBaseRealm
import com.example.tarjetascarrousel.cardCarrousel.data.Local.RCardCarrouselEntity
import com.example.tarjetascarrousel.cardCarrousel.data.mappers.toCardCarrousel
import com.example.tarjetascarrousel.cardCarrousel.data.mappers.toRCardCarrouselEntity
import com.example.tarjetascarrousel.cardCarrousel.domain.models.CardCarrousel
import dagger.hilt.android.qualifiers.ApplicationContext
import io.realm.Realm
import io.realm.RealmModel
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.kotlin.where
import javax.inject.Inject

class CardRealmRepository @Inject constructor(@ApplicationContext val context: Context) : IRealmDataBase{

    var realm2: BizumDataBaseRealm = BizumDataBaseRealm(context)

    fun insertCardListCarrousel (){
        realm2.addObjectFromRealm{ cardListCarrousel().sortedBy { it.BankName }.map { it.toRCardCarrouselEntity() } }
    }


    fun getCardListCarrouselObjects() : List<CardCarrousel> {
        insertCardListCarrousel()
        return realm2.getObjectsFromRealm { where<RCardCarrouselEntity>().findAll() }.map { it.toCardCarrousel() }
    }

    private fun cardListCarrousel () : List<CardCarrousel> = listOf (
        CardCarrousel("ic_favicon_copy_4_white","BBVA", "123456789087656787", "Valido hasta 09/25", "ic_visa_vector", "#FFBB86FC"),
        CardCarrousel("ic_favicon_copy_4_white","SANTANDER", "385569503998764530", "Valido hasta 01/26", "ic_mastercard_vector", "#FF3700B3"),
        CardCarrousel("ic_favicon_copy_4_white","CAIXA", "988544879087495038", "Valido hasta 04/24", "ic_visa_vector", "#000000"),
        CardCarrousel("ic_favicon_copy_4_white","SABADELL", "123456789087656787", "Valido hasta 09/25", "ic_visa_vector", "#FF018786"),
        CardCarrousel("ic_favicon_copy_4_white","BANKIA", "385569503998764530", "Valido hasta 01/26", "ic_mastercard_vector", "#e8c227"),
        CardCarrousel("ic_favicon_copy_4_white","BAKINTER", "988544879087495038", "Valido hasta 04/24", "ic_visa_vector", "#000C66"),
        CardCarrousel("ic_favicon_copy_4_white","DEUTSCHE BANK", "548753215488785654", "Valido hasta 04/24", "ic_visa_vector", "#EADDCA"),
        CardCarrousel("ic_favicon_copy_4_white","CAJAMAR", "988544879087495038", "Valido hasta 04/24", "ic_visa_vector", "#01579b"),
    )


    override fun <O : RealmResults<I>, I : RealmModel> getObjectsFromRealm(action: Realm.() -> O): List<I> {
        TODO("Not yet implemented")
    }

    override fun <T : RealmModel> addObjectFromRealm(action: () -> List<T>) {
        TODO("Not yet implemented")
    }


    override fun <T : RealmObject> deleteObjectFromRealm(action: Realm.() -> T, id: Long) {
        TODO("Not yet implemented")
    }

    override fun <T : RealmModel> deleteAllObjectFromRealm(action: () -> T) {
        TODO("Not yet implemented")
    }
}