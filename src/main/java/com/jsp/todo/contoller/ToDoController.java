package com.jsp.todo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.todo.entity.Task;
import com.jsp.todo.exception.TaskNotFoundException;
import com.jsp.todo.service.TaskService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = {"${settings.cors_origin}"})
@RequestMapping("/todo")
public class ToDoController {
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/findById")
	public ResponseEntity<Task> findTaskById(@RequestParam int id) throws TaskNotFoundException {
		Task task = taskService.findTaskById(id);
		return new ResponseEntity<Task>(task,HttpStatus.OK);
	}
	@PostMapping("/addTask")
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		System.out.println(task);
		taskService.addNewTask(task);
		return new ResponseEntity<Task>(task,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List> getMethodName() {
		List<Task> tasks = taskService.findAllTask();
		return new ResponseEntity<List>(tasks,HttpStatus.OK);
	}
	@DeleteMapping("/deleteTask")
	public ResponseEntity<String> deleteTask(@RequestHeader int id) throws TaskNotFoundException{
		String message = taskService.deleteTaskById(id);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	@PutMapping("/updateTask")
	public ResponseEntity<Task> updateTask(@RequestHeader int id) throws TaskNotFoundException{
		Task task = taskService.updateTaskById(id);
		return new ResponseEntity<Task> (task,HttpStatus.OK);
	}
	
	
	

	
}
