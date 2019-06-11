package individualProcessDetail
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class individualProcess {

	HashMap<String, String> valuesMap = new HashMap<>();

	/**
	 * Keyword clicks on the required process name bubble in the process group
	 */
	@Keyword
	def individualProcessBubble(String processName){
		boolean check = false
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> we = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/ProcessTowerView/ProcessName_bubble/hover_on_process_bubble'), 10)
		println("No.of ele's in the List: " + we.size())

		for(int i=0; i<we.size(); i++){
			Actions act = new Actions(driver);
			act.moveToElement(we[i]).build().perform()
			String nameOfTheProcess = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/ProcessName_bubble/click_on_bubble_name'))
			if(nameOfTheProcess == processName){
				check = true
				act.click(we[i]).build().perform()
				break
			}
		}
		if(check.equals(false)){
			throw new Exception("The "+processName+" is not found in this tower")
		}
	}

	/**
	 * Keyword checks for multiple process names bubble in the process group
	 */
	@Keyword
	boolean MultipleProcessBubble(String processName){
		boolean check = false
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> we = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/ProcessTowerView/ProcessName_bubble/hover_on_process_bubble'), 10)

		for(int i=0; i<we.size(); i++){
			Actions act = new Actions(driver);
			act.moveToElement(we[i]).build().perform()
			String nameOfTheProcess = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/ProcessName_bubble/click_on_bubble_name'))
			if(nameOfTheProcess == processName){
				check = true
				break
			}
		}
		return check
	}

	/**
	 * Keyword gives the values of the individual process details in the individual process view
	 */
	@Keyword
	String processValues(String requiredValue){
		List<String> performanceMatrixList = [
			"Ticket",
			"SLA",
			"Exceptions",
			"Throughput",
			"Cases" ,
			"Yield(%)",
			"AHT"
		]
		String xpath = "//div[@class='row']//div[@class='row']/div//child::*[contains(text(), '%s')]/following::*[1]"
		for(int i=0; i<performanceMatrixList.size(); i++){
			String valueXpath = String.format(xpath, performanceMatrixList[i])
			TestObject valueTestObj = new TestObject("Matrix Value")
			valueTestObj.addProperty("xpath", ConditionType.EQUALS, valueXpath)
			WebUI.waitForPageLoad(10)
			String val = WebUI.getText(valueTestObj)
			valuesMap.put(performanceMatrixList[i], val)
		}
		String val = (String)valuesMap.get(requiredValue);
		return val
	}
}