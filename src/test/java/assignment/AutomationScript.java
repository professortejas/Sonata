package assignment;

import org.testng.annotations.Test;

import generic_utilities.BaseClass;
import generic_utilities.WebDriverLibrary;
import object_repository.ProblemsPage;

public class AutomationScript extends BaseClass{

	
	
	
	@Test
	public void testScriptTest() {
		
		String date="4";
		String month="June";
		String year="2022";
		String email="aaa";
		String index="21:30";
		
		
		ProblemsPage pp=new ProblemsPage(driver);
		pp.getToiletCheckBox().click();
		pp.getNextButton().click();
		
		pp.getReplaceCheckBox().click();
		pp.getNextButton().click();
		
		pp.getLeakInAPipeCheckBox().click();
		pp.getNextButton().click();
		
		pp.getSkipButton().click();
		
		pp.getDateRadioButton().click();
		pp.getNextButton().click();
		
		WebDriverLibrary.selectDate(driver,date, month, year);
		pp.getNextButton().click();
		
		pp.getDropDown().click();
		
		WebDriverLibrary.getOptions(driver, pp.getDropDown(), index);
		pp.getDropDown().click();
	
		
		pp.getNextButton().click();
		
		pp.getEmailTF().sendKeys(email);
	}
}
