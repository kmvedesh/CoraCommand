import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://cncdevui.azurewebsites.net/UI/#/account/login')

not_run: WebUI.waitForPageLoad(GlobalVariable.Max_Delay)

WebUI.maximizeWindow()

try {
    WebUI.verifyElementVisible(findTestObject('Page_Login/div_genpact-logo'))

    WebUI.verifyElementVisible(findTestObject('Page_Login/input_username'))

    WebUI.verifyElementVisible(findTestObject('Page_Login/input_password'))

    WebUI.verifyElementClickable(findTestObject('Page_Login/button_SIGN IN'))

    WebUI.setText(findTestObject('Page_Login/input_username'), 'shilpa.galagali@genpact.com')

    WebUI.setText(findTestObject('Page_Login/input_password'), 'Test@123')

    WebUI.click(findTestObject('Page_Login/button_SIGN IN'))

    not_run: WebUI.waitForPageLoad(GlobalVariable.Max_Delay)

    not_run: WebUI.waitForElementNotVisible(findTestObject('Page_Login/div_SIGN IN_cora-canvas'), GlobalVariable.Max_Delay, 
        FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.verifyElementPresent(findTestObject('Page_Home/a_Dashboard'), 0)
}
catch (Exception e) {
    WebUI.closeBrowser()
} 

