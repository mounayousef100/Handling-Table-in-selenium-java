package com.omayo.hometest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.homepageobject.TablePage;

public class TableTest extends Base {
	private TablePage tablePage;
	@BeforeClass
	public void openPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void clouser() {
		driver.quit();
	}

	@Test()
	public void readonlyTextBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tablePage = new TablePage(driver);
		tablePage.printColumnValues();
		tablePage.printRowValues();
		tablePage.specifiedValue();
		
	}
	
}
