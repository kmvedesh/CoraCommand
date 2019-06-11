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

WebUI.callTestCase(findTestCase('Login/Verify_Login_Valid'), [('Username') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

not_run: WebUI.refresh()

WebUI.mouseOver(findTestObject('Object Repository/WorkforceAvailability/Click_Robot'))

CustomKeywords.'commonKeys.Keys.clickWFA'(findTestObject('Object Repository/WorkforceAvailability/Click_Robot'), 10)

ActualUrl = WebUI.getUrl()

ExpectedUrl = 'http://cncdevui.azurewebsites.net/UI/#/root/dashboard/view/robot/details'

if (ActualUrl.equals(ExpectedUrl)) {
	WebUI.comment('Robot Detail screen is displayed')
} else {
	WebUI.comment('Robot Detail screen is not displayed')
}

String RobotName = WebUI.getText(findTestObject('Object Repository/RobotDetailElements/RobotName'))

WebUI.comment('Robot name is :' + RobotName)

WebUI.verifyElementVisible(findTestObject('Object Repository/RobotDetailElements/Platform'))

ControllerName = WebUI.verifyElementVisible(findTestObject('Object Repository/RobotDetailElements/Controller Name'))

DurationName = WebUI.verifyElementVisible(findTestObject('Object Repository/RobotDetailElements/Duration'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

