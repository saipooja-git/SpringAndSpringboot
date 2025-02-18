package com.webapplication.springboot.ToDoWebApp.TODO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
@Service
public class ToDoService {
private static List<ToDo> todos = new ArrayList<ToDo>();
private static int todoscount=0;
static {
	todos.add(new ToDo(++todoscount,"in28minutes","SpringABCDE",LocalDate.now().plusYears(1),false));
	todos.add(new ToDo(++todoscount,"in28minutes","Spring Boot",LocalDate.now().plusYears(1),false));
	todos.add(new ToDo(++todoscount,"in28minutes","React",LocalDate.now().plusYears(1),false));
	todos.add(new ToDo(++todoscount,"in28minutes","node.js",LocalDate.now().plusYears(1),true));
	
}

public List<ToDo> findByUsername(String username) {
	return todos;
}

public void addTodo(String username,String description,LocalDate targetDate,boolean done) {
	ToDo todo = new ToDo(++todoscount,username,description,targetDate,done);
	todos.add(todo);
}

public void DeleteById(int id) {
	Predicate<? super ToDo> predicate=todo ->todo.getId()==id;
	todos.removeIf(predicate);
}

public ToDo findById(int id) {
    Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
    ToDo todo = todos.stream().filter(predicate).findFirst().orElse(null);

    System.out.println("Looking for ToDo with ID: " + id);
    if (todo == null) {
        System.out.println("ToDo not found for ID: " + id);
    } else {
        System.out.println("Found ToDo: " + todo);
    }

    return todo;
}


public void updateTodo(@ Valid ToDo todo) {
    // Find the existing ToDo by ID
    ToDo existingTodo = findById(todo.getId());
    
    if (existingTodo != null) {
        // Remove the old ToDo and add the updated one
        todos.remove(existingTodo);
        todos.add(todo);
    } else {
        throw new IllegalArgumentException("ToDo with ID " + todo.getId() + " not found");
    }
}

}
