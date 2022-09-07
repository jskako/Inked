package com.jskako.inked.feature_note.domain.module

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jskako.inked.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val createDate: String,
    val editDate: String,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)