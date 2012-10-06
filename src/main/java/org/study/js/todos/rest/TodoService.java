package org.study.js.todos.rest;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

import org.study.js.todos.model.Todo;

@Path("/todos")
@Stateless
public class TodoService extends BaseEntityService<Todo> {

	public TodoService() {
		super(Todo.class);
	}
	
}
