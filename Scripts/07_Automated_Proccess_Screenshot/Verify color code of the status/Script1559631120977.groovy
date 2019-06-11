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
	WebUI.click(findTestObject('Object Repository/Page_Automated_screenshot/XpathOfAutomtedSnapshot'))
	String activeColorCode = WebUI.getCSSValue(findTestObject('Object Repository/Page_Automated_screenshot/Page_Cora Command Center/blueDotXpath'), 'background-color')
	String completedColorCode = WebUI.getCSSValue(findTestObject('Object Repository/Page_Automated_screenshot/Page_Cora Command Center/greenDotXpath'), 'background-color')
	String failedColorCode = WebUI.getCSSValue(findTestObject('Object Repository/Page_Automated_screenshot/Page_Cora Command Center/redDotXpath'), 'background-color')
	String scheduledColorCode = WebUI.getCSSValue(findTestObject('Object Repository/Page_Automated_screenshot/Page_Cora Command Center/greyDotXpath'), 'background-color')
	if(activeColorCode == GlobalVariable.Automated_Proc_ActiveColorCode && completedColorCode == GlobalVariable.Automate_Proc_Completed_code && failedColorCode == GlobalVariable.Automated_Proc_Failed_Code && scheduledColorCode == GlobalVariable.Automated_Proc_Scheduled)
	{
		assert true
		println "Color code match for all process status"
	}else{
		assert false
	}
	println "$activeColorCode $completedColorCode $failedColorCode $scheduledColorCode"
	
}catch(Exception e){
	WebUI.closeBrowser()
	assert false
}