package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;

public class CreateCustomer extends BaseClass{
	//@Test()
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException{
		Reporter.log("testTasks",true);
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();
		TaskList tl = new TaskList(driver);
		tl.setAddNew();;
		tl.setNewCustomer();
		Thread.sleep(2500);
		FileLib f = new FileLib();
		String custName = f.getExcelData("CreatCustomer", 1, 4);
		String custDesc = f.getExcelData("CreatCustomer", 1, 5);
		tl.setEnterCustomerName(custName);
		tl.setDescription(custDesc);
		tl.setDropDown();
		tl.setBigBag();
		Thread.sleep(2000);
		tl.setCreateCustomer();
		Thread.sleep(5000);
		String actualName = tl.getActualName().getText();
		String expectedResult = custName;
		Assert.assertEquals(actualName, expectedResult);
		}
	}
