package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage{

	public TodoPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "todo-input")
	public static WebElement inputText;
	
	@FindBy(how = How.XPATH, using = "//label[@data-testid='todo-item-label']")
	public static WebElement todoText;
	
	@FindBy(how = How.XPATH, using = "//input[@data-testid='todo-item-toggle']")
	public static WebElement checkBox;
	
	public void submitTodo(String todo) {
		inputText.clear();
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
	}
	
	public boolean isElementDisplayed(WebElement element) {
		boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
	
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public boolean isCheckBoxSelected(WebElement element) {
		boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;
	}
	
	
	
	
	
	
	
	
}
