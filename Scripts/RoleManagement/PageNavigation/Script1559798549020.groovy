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

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/License_Details/Settings'), GlobalVariable.Min_Delay)

WebUI.click(findTestObject('Object Repository/License_Details/Settings'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Role_Management/Rolemanagament_card'), GlobalVariable.Min_Delay)

WebUI.click(findTestObject('Object Repository/Role_Management/Rolemanagament_card'))

String createroletext = WebUI.getText(findTestObject('Object Repository/Role_Management/Create_role'))

if (createroletext == 'Create Role') {
    println('match found')
} else {
    println('match not found')
}

WebUI.closeBrowser()

