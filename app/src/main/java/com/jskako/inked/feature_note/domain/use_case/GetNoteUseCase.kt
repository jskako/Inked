package com.jskako.inked.feature_note.domain.use_case

import com.jskako.inked.feature_note.domain.module.Note
import com.jskako.inked.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}