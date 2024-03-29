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

WebUI.scrollToElement(findTestObject('Object Repository/ProcessTowerView/todayssummary_text'), 2)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/Listviewicon'), GlobalVariable.Min_Delay)

WebUI.click(findTestObject('Object Repository/ProcessTowerView/Listviewicon'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/AutomatedProcess_text'), GlobalVariable.Min_Delay)

automatedtextvalue = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/AutomatedProcess_text'))

WebUI.comment(automatedtextvalue)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProcessTowerView/Failedcount'), GlobalVariable.Min_Delay)

failedcount = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/Failedcount'))

if (failedcount != 0) {
    println('Failed process exist')
} else {
    println('Failed process does not exist')
}

WebUI.closeBrowser()

