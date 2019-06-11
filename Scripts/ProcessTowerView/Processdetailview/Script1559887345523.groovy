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

String requiredCard = 'Process Tower View'

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()

if (activeCard != requiredCard) {
    CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
}

WebUI.waitForPageLoad(3, FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('Object Repository/ProcessTowerView/Processtowerview_header'), 2)
//WebUI.doubleClick(findTestObject('Object Repository/ProcessTowerView/ProcessTowerview_Widget'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/ProcessTowerView/todayssummary_text'), 2)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/RTR_Processclick'), GlobalVariable.Min_Delay)

WebUI.click(findTestObject('Object Repository/ProcessTowerView/RTR_Processclick'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/RTR_text'), GlobalVariable.Min_Delay)

rtrtext = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/RTR_text'))

WebUI.comment(rtrtext)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/Process_click'), GlobalVariable.Min_Delay)

WebUI.click(findTestObject('Object Repository/ProcessTowerView/Process_click'))

processviewpagevalidation = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/processview_validation'))

WebUI.comment(processviewpagevalidation)

WebUI.closeBrowser()

