package com.jn.creditcardmanager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jn.creditcardmanager.database.dao.CreditCardDao
import com.jn.creditcardmanager.database.entity.CreditCardModel

/**
 * Created on 08-09-2019.
 */
@Database(entities = [CreditCardModel::class], version = 1, exportSchema = false)
abstract class AppDatabaseHelper(context: Context) : RoomDatabase() {

    abstract fun creditCardDao(): CreditCardDao

    val appDatabase =
        Room.databaseBuilder(context.applicationContext, AppDatabaseHelper::class.java, "card_database").build()
}