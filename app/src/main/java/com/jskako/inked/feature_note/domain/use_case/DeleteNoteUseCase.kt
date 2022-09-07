package com.jskako.inked.feature_note.domain.use_case

import com.jskako.inked.feature_note.domain.module.Note
import com.jskako.inked.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}