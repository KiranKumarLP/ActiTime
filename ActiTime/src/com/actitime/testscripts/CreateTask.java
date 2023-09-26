package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;

public class CreateTask extends BaseClass{
	@Test
	public void testCreateTask() throws InterruptedException {
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();
		TaskList t = new TaskList(driver);
		t.setAddNew();
		Thread.sleep(2500);
		t.setNewTasksBtn();
		Thread.sleep(2500);
		t.setTaskCustomer();
		t.setTaskDropDown();
		Thread.sleep(2500);
		t.setEnterTaskCustomerName("QSP");
		Thread.sleep(2500);
		t.setNewtaskProject();
		t.setTakSelectProjectTx("Institute");
		Thread.sleep(2500);
		t.setEnterNewTaskTx("QSP Training Institue");
		Thread.sleep(2500);
		t.setCretaTaskBtn();
		
		
	}
}
