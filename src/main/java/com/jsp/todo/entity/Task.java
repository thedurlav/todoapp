package com.jsp.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private boolean completed;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}
@Override
public String toString() {
	return "Task [id=" + id + ", name=" + name + ", completed=" + completed + "]";
}

}
