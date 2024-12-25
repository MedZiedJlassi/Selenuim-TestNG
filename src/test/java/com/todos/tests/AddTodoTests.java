package com.todos.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.SeleniumUtils;
import com.todos.utils.Setup;

public class AddTodoTests extends Setup{
	
	public SeleniumUtils utils;

	public AddTodoTests() throws IOException {
		super();
		this.utils = new SeleniumUtils();
	}
	
	TodoPage todoPage;
	@Test(priority = 1)
	public void iCanAddToDo() throws IOException {
		todoPage = new TodoPage();
//		boolean todoField = todoPage.isElementDisplayed(TodoPage.inputText);
		boolean todoField = utils.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(todoField);
//		todoPage.submitTodo(prop.getProperty("todo"));
		utils.submitTodo(TodoPage.inputText, prop.getProperty("todo"));
//		String elementTodo = todoPage.checkElementContain(TodoPage.todoText);
		utils.checkElementContain(TodoPage.todoText);
//		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo")));
		utils.assertTrue(TodoPage.todoText, prop.getProperty("todo"));
//		boolean checkBox = todoPage.isCheckBoxSelected(TodoPage.checkBox);
		boolean checkBox = utils.isCheckboxSelected(TodoPage.checkBox);
//		Assert.assertFalse(checkBox);
		utils.assertFalse(checkBox);
	}
	
	

}
