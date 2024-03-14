package com.hzwn.task.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hzwn.task.document.TaskDocument;

@Repository
public interface TaskRepository extends MongoRepository<TaskDocument, ObjectId> {
	
}
