package com.jsp.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.todo.dao.TaskDao;
import com.jsp.todo.entity.Task;
import com.jsp.todo.exception.TaskNotFoundException;
@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao dao;
	
	public Task findTaskById(int id) throws TaskNotFoundException {
		return dao.findById(id);
	}
	public Task addNewTask(Task task) {
		return dao.addNew(task);
	}
	@Override
	public List<Task> findAllTask() {
		return dao.findAll();
	}
	

	
}
