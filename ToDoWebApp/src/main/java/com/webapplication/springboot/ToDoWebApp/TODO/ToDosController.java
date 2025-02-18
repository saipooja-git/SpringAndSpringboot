package com.webapplication.springboot.ToDoWebApp.TODO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
@Controller
@SessionAttributes("name")
public class ToDosController {
@Autowired
	private ToDoService todoservice;

	public ToDosController(ToDoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	@RequestMapping("list")
	public String ToDosList(ModelMap model) {
		List<ToDo> todos = todoservice.findByUsername("in28minutes");
		model.addAttribute("todos", todos);
		return "list";
	}
	//GET,POST so actually its handling both get request and post request so we wrote two different 
	// methods to handle them
	@RequestMapping(value="addTodo",method=RequestMethod.GET)
	public String showTodo(ModelMap model) {
		String username= (String)model.get("name");
		ToDo todo = new ToDo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "addTodo";
	}
	
	@RequestMapping(value = "addTodo", method = RequestMethod.POST)
	public String newTodo(ModelMap model, @Valid ToDo todo, BindingResult result) {
	    if (result.hasErrors()) {
	        return "addTodo"; // Stay on the same page if validation fails
	    }

	    String username = (String) model.get("name");
	    todoservice.addTodo(username, todo.getDescription(),todo.getTrackDate(), false);
	    
	    return "redirect:list"; // Redirect only if validation passes
	}


	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id, ModelMap model) {
	    ToDo todo = todoservice.findById(id);
	    if (todo == null) {
	        model.addAttribute("errorMessage", "ToDo not found!");
	        return "errorPage"; // Redirect to an error page instead of breaking
	    }
	    todoservice.DeleteById(id);
	    return "redirect:list";
	}



	@RequestMapping(value="update-todo", method = RequestMethod.GET)
	public String updateTodo(@RequestParam int id, ModelMap model) {
	    ToDo todo = todoservice.findById(id);
	    
	    if (todo == null) {
	        model.addAttribute("errorMessage", "ToDo not found!");
	        return "errorPage"; // Redirect to a custom error page
	    }

	    model.addAttribute("todo", todo); // ✅ Ensure todo object is added
	    return "updateTodo"; // ✅ Must match the JSP filename
	}



	
	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String NewUpdateTodo(ModelMap model, @Valid ToDo todo, BindingResult result) {
	    if (result.hasErrors()) {
	        return "updateTodo"; // Stay on the update page if validation fails
	    }

	    ToDo existingTodo = todoservice.findById(todo.getId());
	    if (existingTodo == null) {
	        model.addAttribute("errorMessage", "ToDo not found!");
	        return "errorPage"; // Redirect to error page
	    }

	    String username = (String) model.get("name");
	    todo.setUsername(username);
	    todoservice.updateTodo(todo);
	    
	    return "redirect:list"; // Redirect to list page after successful update
	}


}
