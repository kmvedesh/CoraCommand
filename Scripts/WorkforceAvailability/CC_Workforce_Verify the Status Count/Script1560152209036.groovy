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

//WebUI.click(findTestObject('Object Repository/Page_Cora Command Center/span_btestb_pull-right glyphicon glyphicon-triangle-bottom'))
//WebUI.click(findTestObject('Object Repository/Page_Cora Command Center/li_Walmart Lab'))
WebUI.delay(40)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Available'), FailureHandling.STOP_ON_FAILURE)

AvailableCount = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Available'))

WebUI.comment('Available Robots Count : ' + AvailableCount)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Disconnected'), FailureHandling.STOP_ON_FAILURE)

DisconnectedCount = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Disconnected'))

WebUI.comment('Disconnected Robots Count : ' + DisconnectedCount)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Busy'))

BusyCount = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/Status Count - Busy'))

WebUI.comment('Busy Robots Count : ' + BusyCount)

WebUI.closeBrowser()

