package com.hzwn.task.webservice;

import com.hzwn.task.entity.Note;
import com.hzwn.task.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteWebService {

    private final NoteService noteService;

    @Autowired
    public NoteWebService(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        Note note = noteService.getNoteById(id);
        return note != null ? ResponseEntity.ok(note) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        Note createdNote = noteService.createNote(note);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @RequestBody Note note) {
        Note updatedNote = noteService.updateNote(id, note);
        return updatedNote != null ? ResponseEntity.ok(updatedNote) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNoteById(@PathVariable Long id) {
        noteService.deleteNoteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/status/{status}")
    public List<Note> getNotesByStatus(@PathVariable Note.Status status) {
        return noteService.findByStatus(status);
    }

    @GetMapping("/tag/{tag}")
    public List<Note> getNotesByTag(@PathVariable String tag) {
        return noteService.findByTag(tag);
    }
}
