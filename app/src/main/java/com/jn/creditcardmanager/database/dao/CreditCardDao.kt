package com.jn.creditcardmanager.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jn.creditcardmanager.database.entity.CreditCardModel

/**
 * Created on 08-09-2019.
 */
@Dao
interface CreditCardDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserCard(creditCardModel: CreditCardModel)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateCard(creditCardModel: CreditCardModel)

    @Delete
    fun deleteCard(creditCardModel: CreditCardModel)

    @Query("SELECT * FROM table_card")
    fun getAllCards(): LiveData<List<CreditCardModel>>
}