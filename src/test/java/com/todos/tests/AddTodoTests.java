package com.todos.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTests extends Setup{

	public AddTodoTests() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	@Test(priority = 1)
	public void iCanAddToDo() throws IOException {
		todoPage = new TodoPage();
		boolean todoField = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(todoField);
		todoPage.submitTodo(prop.getProperty("todo"));
		String elementTodo = todoPage.checkElementContain(TodoPage.todoText);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo")));
		boolean checkBox = todoPage.isCheckBoxSelected(TodoPage.checkBox);
		Assert.assertFalse(checkBox);
	}
	
	

}
