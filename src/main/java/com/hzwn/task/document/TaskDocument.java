package com.hzwn.task.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "tasks")
@Data
public class TaskDocument {

	@Id
	private ObjectId id;
	private Long taskId;
	private String taskName;
	private String taskDescription;
	private String taskDate;
	private Boolean taskOpen;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public Boolean getTaskOpen() {
		return taskOpen;
	}

	public void setTaskOpen(Boolean taskOpen) {
		this.taskOpen = taskOpen;
	}

	public TaskDocument(Long taskId, String taskName, String taskDescription, String taskDate, Boolean taskOpen) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskDate = taskDate;
		this.taskOpen = taskOpen;
	}

	@Override
	public String toString() {
		return "TaskDocument [id=" + id + ", taskId=" + taskId + ", taskName=" + taskName + ", taskDescription="
				+ taskDescription + ", taskDate=" + taskDate + ", taskOpen=" + taskOpen + "]";
	}

}
