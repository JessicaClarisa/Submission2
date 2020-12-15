package com.ata.appbundle.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ata.appbundle.core.data.source.local.model.FilmEntity

@Database(entities = [FilmEntity::class], version = 1, exportSchema = false)
abstract class FilmDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao

}