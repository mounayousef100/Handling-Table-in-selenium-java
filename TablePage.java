package com.omayo.homepageobject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class TablePage {
	 public WebDriver driver;
	    Action action = new Action();

	    @FindBy(xpath = "//table[@id='table1']/tbody/tr")
	    private List<WebElement> rows;

	    @FindBy(xpath = "//table[@id='table1']/tbody/tr[2]/td")
	    private List<WebElement> firstRowCells;
	    
		@FindBy(xpath = "//table[@id='table1']/thead/tr")
		private WebElement thead;
		
		@FindBy(xpath = "//table[@id='table1']/thead/tr/th[2]")
		private WebElement Age;
		
		@FindBy(xpath = "//table[@id='table1']/tbody/tr[3]/td[1]")
		private WebElement Praveen;
		
		@FindBy(xpath = "//table[@id='table1']/tbody/tr[2]/td[3]")
		private WebElement Pune;
		
	    public TablePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void printColumnValues() {
	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.xpath("td[2]"));
	            if (!cells.isEmpty()) {
	                String cellText = cells.get(0).getText();
	                System.out.println(cellText);
	            }
	        }
	        
	        System.out.println("**************************");
	    }
	    
	    public void printRowValues() {
	        for (WebElement cell : firstRowCells) {
	            String cellText = cell.getText();
	            System.out.print(cellText+"  ");
	        }
	        System.out.println("");
	    }
	    
	    public void specifiedValue() throws InterruptedException {
			Thread.sleep(3000);
			String thead_text = action.getText(thead);
			String age_text = action.getText(Age);
			String praveen_text = action.getText(Praveen);
			String 	pune_text = action.getText(	Pune);
			System.out.println("**************************");
			System.out.println(thead_text);
			System.out.println("**************************");
			System.out.println(age_text);
			System.out.println("**************************");
			System.out.println(praveen_text);
			System.out.println("**************************");
			System.out.println(pune_text);
		
			Thread.sleep(3000);
		}
}