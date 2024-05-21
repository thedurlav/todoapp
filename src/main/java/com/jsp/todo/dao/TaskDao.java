package com.jsp.todo.dao;

import java.util.List;

import com.jsp.todo.entity.Task;
import com.jsp.todo.exception.TaskNotFoundException;

public interface TaskDao {
	public Task findById(int id) throws TaskNotFoundException;
	public Task addNew(Task task);
	public List<Task> findAll();
}
