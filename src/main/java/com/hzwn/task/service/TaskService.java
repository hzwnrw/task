package com.hzwn.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzwn.task.document.TaskDocument;
import com.hzwn.task.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public List<TaskDocument> allTask() {
		return taskRepository.findAll();
	}
	
	public TaskDocument createTask(TaskDocument taskDocument) {
		return taskRepository.insert(taskDocument);
		
	}
}
