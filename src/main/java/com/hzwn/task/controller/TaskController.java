package com.hzwn.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzwn.task.document.TaskDocument;
import com.hzwn.task.service.TaskService;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/list")
	public ResponseEntity<List<TaskDocument>> getAllTask() {
		return new ResponseEntity<List<TaskDocument>>(taskService.allTask(), HttpStatus.OK);

	}

	@PostMapping("/createTask")
	public ResponseEntity<TaskDocument> createTask(@RequestBody TaskDocument taskDocument) {

		return new ResponseEntity<TaskDocument>(taskService.createTask(taskDocument), HttpStatus.OK);

	}
}
