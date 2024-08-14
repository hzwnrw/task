package com.hzwn.task.service;

import com.hzwn.task.entity.Note;
import com.hzwn.task.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public Note findById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public List<Note> findByStatus(Note.Status status) {
        return noteRepository.findByStatus(status);
    }

    public List<Note> findByTag(String tag) {
        return noteRepository.findByTagsContaining(tag);
    }
}
