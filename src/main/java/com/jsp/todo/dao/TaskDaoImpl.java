package com.jsp.todo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.todo.entity.Task;
import com.jsp.todo.entity.repo.TaskRepository;
import com.jsp.todo.exception.TaskNotFoundException;

@Repository
public class TaskDaoImpl implements TaskDao {
	@Autowired
	private TaskRepository repository;

	public Task findById(int id) throws TaskNotFoundException {
		Optional<Task> optional = repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		throw new TaskNotFoundException("Invalid Input Id");
	}

	public Task addNew(Task task) {
		return repository.save(task);
	}

	@Override
	public List<Task> findAll() {
		return repository.findAll();
	}

	@Override
	public String deleteTaskById(int id) throws TaskNotFoundException {
		Optional<Task> optional = repository.findById(id);
		if (optional.isPresent()) {
			repository.deleteById(id);
			return "Task Deleted With Id : " + id;
		}
		throw new TaskNotFoundException("Invalid Input Id");
	}

}
