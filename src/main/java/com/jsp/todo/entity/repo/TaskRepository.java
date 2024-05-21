package com.jsp.todo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.todo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
