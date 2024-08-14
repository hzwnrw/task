package com.hzwn.task.repository;

import com.hzwn.task.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByStatus(Note.Status status);
    List<Note> findByTagsContaining(String tag);
}
