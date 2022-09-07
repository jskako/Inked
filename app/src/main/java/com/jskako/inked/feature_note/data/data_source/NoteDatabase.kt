package com.jskako.inked.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jskako.inked.feature_note.domain.module.Note

@Database(
    exportSchema = true,
    version = 1,
    entities = [Note::class],
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}