package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.SeleniumUtils;
import com.todos.utils.Setup;

public class RemoveTodo extends Setup{
	
	public SeleniumUtils utils;
	public TodoPage todoPage;
	
	public RemoveTodo() throws IOException {
		super();
		this.utils = new SeleniumUtils();
	}
	
	@Test
	public void iRemoveToDo() throws IOException {
		todoPage = new TodoPage();
		utils.submitTodo(TodoPage.inputText, prop.getProperty("todo"));
		utils.click(TodoPage.checkBox);
		utils.click(TodoPage.removeBtn);
		String pageSource = todoPage.getPageSource();
		Assert.assertFalse(pageSource.contains(prop.getProperty("todo")));
		System.out.println("Removed");
	}
}
