package com.jsp.todo.service;

import java.util.List;

import com.jsp.todo.entity.Task;
import com.jsp.todo.exception.TaskNotFoundException;

public interface TaskService {
	public Task findTaskById(int id) throws TaskNotFoundException;
	public Task addNewTask(Task task);
	public List<Task> findAllTask();
	public String deleteTaskById(int id) throws TaskNotFoundException;
}
