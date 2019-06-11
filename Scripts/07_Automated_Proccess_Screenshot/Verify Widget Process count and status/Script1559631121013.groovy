import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('04_Create_User_TestCases/Log in with super admin'), [('usernameEmail') : 'sunayana.rao@genpact.digital'
	, ('password') : 'cvW8qx4B2o3F4VwP/kNsqA=='], FailureHandling.STOP_ON_FAILURE)
try{
	WebUI.click(findTestObject('Object Repository/Page_Automated_screenshot/a_Test Acount'))
	WebUI.click(findTestObject('Object Repository/Page_Automated_screenshot/li_Walmart Lab'))
	WebUI.delay(10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForActiveTxt'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForActiveCount'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForCompetedCount'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForCompletedText'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForFailedCount'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForFailedText'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForScheduledCount'), 30)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automated_process_Widget/xpathForScheduledText'), 30)

}catch(Exception e){
	WebUI.closeBrowser()
	assert false
}