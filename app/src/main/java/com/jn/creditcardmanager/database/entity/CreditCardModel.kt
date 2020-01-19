package com.jn.creditcardmanager.database.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * Created on 08-09-2019.
 */
@Entity(tableName = "table_card")
class CreditCardModel {

    @PrimaryKey(autoGenerate = true)
    var cardId: Int = 0
    var cardName: String
    var cardNumber: String
    var cardCVV: String
    var cardExpiryDate: String
    var cardType: String

    constructor(
        cardId: Int, cardName: String, cardNumber: String, cardCVV: String, cardExpiryDate: String, cardType: String
    ) {
        this.cardId = cardId
        this.cardName = cardName
        this.cardNumber = cardNumber
        this.cardCVV = cardCVV
        this.cardExpiryDate = cardExpiryDate
        this.cardType = cardType
    }

    @Ignore
    constructor(cardName: String, cardNumber: String, cardCVV: String, cardExpiryDate: String, cardType: String) {
        this.cardName = cardName
        this.cardNumber = cardNumber
        this.cardCVV = cardCVV
        this.cardExpiryDate = cardExpiryDate
        this.cardType = cardType
    }
}

