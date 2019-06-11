import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

try {
    WebUI.verifyElementVisible(findTestObject('Object Repository/License_Details/Settings'))

    WebUI.click(findTestObject('Object Repository/License_Details/Settings'))

    WebUI.delay(5)

    WebUI.waitForElementPresent(findTestObject('Object Repository/SLA_Setting/SLA'), GlobalVariable.Min_Delay)

    WebUI.click(findTestObject('Object Repository/SLA_Setting/SLA'))

    WebUI.waitForElementPresent(findTestObject('Object Repository/SLA_Setting/SLA_Configuration'), GlobalVariable.Min_Delay)

    String SLA_Configuration = WebUI.getText(findTestObject('Object Repository/SLA_Setting/SLA_Configuration'))

    Assert.assertEquals(SLA_Configuration, 'SLA Configuration')
}
catch (Exception e) {
    WebUI.closeBrowser()
} 

WebUI.closeBrowser()

