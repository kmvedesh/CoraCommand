package header_ViewName
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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

class Header {
	/**
	 * Keyword gives active card name on dashboard after login
	 */
	@Keyword
	String activeCardHeaderName() {
		boolean workforceAvail = WebUI.verifyElementPresent(findTestObject('Object Repository/Header_Name/workforce_availaibilty'), 3,FailureHandling.OPTIONAL)
		boolean processTowerView = WebUI.verifyElementPresent(findTestObject('Object Repository/Header_Name/process_tower_view'), 3,FailureHandling.OPTIONAL)
		boolean exceptionAnalysis = WebUI.verifyElementPresent(findTestObject('Object Repository/Header_Name/exception_analysis'), 3,FailureHandling.OPTIONAL)
		boolean notifiLicenseGeography = WebUI.verifyElementPresent(findTestObject('Object Repository/Header_Name/notification_licenseInventory_geographyView'), 3,FailureHandling.OPTIONAL)

		if(workforceAvail == true){
			String wfaHeader = WebUI.getText(findTestObject('Object Repository/Header_Name/workforce_availaibilty'))
			return wfaHeader
		}
		else if(processTowerView == true){
			String ptvHeader = WebUI.getText(findTestObject('Object Repository/Header_Name/process_tower_view'))
			return ptvHeader
		}
		else if(exceptionAnalysis == true){
			String eaHeader = WebUI.getText(findTestObject('Object Repository/Header_Name/exception_analysis'))
			return eaHeader
		}
		else if(notifiLicenseGeography == true){
			String header = WebUI.getText(findTestObject('Object Repository/Header_Name/notification_licenseInventory_geographyView'))
			return header
		}
	}
}