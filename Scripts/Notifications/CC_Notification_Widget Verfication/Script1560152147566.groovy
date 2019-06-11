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

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Cora Command Center/Notificaitons Widget click'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cora Command Center/Notificaitons Widget click'), 2)

IsnotificationPresent = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Notificaitons Widget click'))

WebUI.comment('Text:' + IsnotificationPresent)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cora Command Center/Errors Text Verification'), 2)

ErrorsPresent = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Errors Text Verification'))

WebUI.comment('Text:' + ErrorsPresent)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cora Command Center/Info text verification'), 2)

InfoPresent = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Info text verification'))

WebUI.comment('Text:' + InfoPresent)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cora Command Center/Warnings text verification'), 2)

WarningsPresent = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Warnings text verification'))

WebUI.comment('Text:' + WarningsPresent)

WebUI.closeBrowser()

