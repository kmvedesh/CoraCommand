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

//String requiredCard = 'Notifications'
WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

//String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()
//if (activeCard != requiredCard) {
//    CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
//}
WebUI.scrollToElement(findTestObject('Object Repository/License Inventory/License Inventory_Widget'), 0)

'Verify License Inventory widget'
WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/License Inventory_Widget'), 0)

WebUI.scrollToElement(findTestObject('License Inventory/License Inventory_Widget'), 0)

'License Total text verification'
WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseWidget_Total'), 10)

TextTotal = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseWidget_Total'))

WebUI.comment('Text shown :' + TextTotal)

'License Expired Text verification'
WebUI.verifyElementText(findTestObject('Object Repository/License Inventory/LicenseWidget_Expired'), 'Expired')

Status1 = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseWidget_Expired'))

WebUI.comment('Text Shown : ' + Status1)

'License installed text verification'
WebUI.verifyElementText(findTestObject('Object Repository/License Inventory/LicenseWidget_Installed'), 'Installed')

Status2 = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseWidget_Installed'))

WebUI.comment('Text Shown : ' + Status2)

'License Unused text verification'
WebUI.verifyElementText(findTestObject('Object Repository/License Inventory/LicenseWidget_Unused'), 'Unused')

Status3 = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseWidget_Unused'))

WebUI.comment('Text Shown : ' + Status3)

WebUI.closeBrowser()

