package com.actitime.testscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackpage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementaion.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer", 1, 2);
	String customerDesc = f.getExcelData("CreateCustomer", 1, 3);
	EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
	e.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getEnterCustNameTbx().sendKeys(customerName);
	t.getEnterCustDescriptionTbx().sendKeys(customerDesc);
	t.getSelectCustomerDD().click();
	t.getBigBangCompanyTx().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String actualCustomerText = t.getActualCustomer().getText();
	Assert.assertEquals(actualCustomerText, customerName);
	}
}
