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

try {
    WebUI.verifyElementVisible(findTestObject('Object Repository/License_Details/Settings'))

    WebUI.click(findTestObject('Object Repository/License_Details/Settings'))

    WebUI.delay(5)

    WebUI.waitForElementPresent(findTestObject('Object Repository/SLA_Setting/SLA_Total'), GlobalVariable.Min_Delay)

    String SLA_Total = WebUI.getText(findTestObject('Object Repository/SLA_Setting/SLA_Total'))

    println(SLA_Total)
}
catch (Exception e) {
    WebUI.closeBrowser()
} 

WebUI.closeBrowser()

