package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskList {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[contains(text(),'New Customer')]")
	private WebElement newCustomerBtn;

	//Create customer
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustNameTx;

	@FindBy(xpath = "(//textarea[@class='textarea'])[9]")
	private WebElement DescTx;

	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement SelectCust;

	@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[1]")
	private WebElement BigBang;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualName;

	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement createProjBtn;

	//create Project
	@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectName;

	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customer;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow 'and text()='Big Bang Company']")
	private WebElement projectDropDown;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;

	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjetBtn;

	//create Task
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTasksBtn;

	@FindBy(xpath = "//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")
	private WebElement newTaskCust;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow selected' and text()='Big Bang Company']")
	private WebElement taskDropDown;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Flight operations']")
	private WebElement newtaskProject;
	
	@FindBy(xpath = "//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")
	private WebElement enterTaskCustName;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectTx;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder']")
	private WebElement enterNewTaskTx;

	@FindBy(xpath = "Create Tasks")
	private WebElement cretaTaskBtn;

	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setAddNew() {
		addNewBtn.click();
	}

	public void setNewCustomer() {
		newCustomerBtn.click();
	}

	public void setEnterCustomerName(String name) {
		enterCustNameTx.sendKeys(name);
	}

	public void setDescription(String desc) {
		DescTx.sendKeys(desc);
	}

	public void setDropDown() {
		SelectCust.click();
	}

	public void setBigBag() {
		BigBang.click();
	}

	public void setCreateCustomer() {
		createCustBtn.click();
	}

	public WebElement getActualName() {
		return actualName;
	}

	public void setCreateProjectBtn() {
		createProjBtn.click();
	}

	public void setEnterProjName(String name) {
		enterProjectName.sendKeys(name);
	}

	public void setCustomer() {
		customer.click();
	}

	public void setProjDropDown() {
		projectDropDown.click();
	}

	public void setProjDesc(String desc) {
		projectDescription.sendKeys(desc);
	}

	public void setCreateProjectButton() {
		createProjetBtn.click();
	}

	public void setNewTasksBtn() {
		newTasksBtn.click();
	}

	public void setTaskCustomer() {
		newTaskCust.click();
	}

	public void setTaskDropDown() {
		taskDropDown.click();
	}

	public void setNewtaskProject() {
		newtaskProject.click();
	}
	public void setEnterTaskCustomerName(String name) {
		enterTaskCustName.sendKeys(name);
	}
	public void setTakSelectProjectTx(String name) {
		selectProjectTx.sendKeys(name);
	}

	public void setEnterNewTaskTx(String name) {
		enterNewTaskTx.sendKeys(name);
	}

	public void setCretaTaskBtn() {
		cretaTaskBtn.click();
	}
}
