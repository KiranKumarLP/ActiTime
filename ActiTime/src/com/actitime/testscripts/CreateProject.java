package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;

public class CreateProject extends BaseClass{
	@Test
	public void testCreateProject() throws InterruptedException {
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();
		TaskList t = new TaskList(driver);
		t.setAddNew();
		t.setCreateProjectBtn();
		Thread.sleep(5000);
		t.setEnterProjName("Karnataka Bank");
		t.setCustomer();
		t.setProjDropDown();
		Thread.sleep(5000);
		t.setProjDesc("Karnataka Pvt Lmtd");
		Thread.sleep(5000);
		t.setCreateProjectButton();
		Thread.sleep(10000);
	}

}
