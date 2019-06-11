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

//WebUI.waitForPageLoad(30)
//WebUI.refresh()
//WebUI.click(findTestObject('Object Repository/Page_Cora Command Center/span_btestb_pull-right glyphicon glyphicon-triangle-bottom'))
//WebUI.click(findTestObject('Object Repository/Page_Cora Command Center/li_Walmart Lab'))
WebUI.delay(40)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/span_Disconnected'), FailureHandling.STOP_ON_FAILURE)

Status1 = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/span_Disconnected'))

WebUI.comment('Status name :' + Status1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/span_Busy'), FailureHandling.STOP_ON_FAILURE)

Status2 = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/span_Busy'))

WebUI.comment('Status name :' + Status2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Cora Command Center/span_Available'))

Status3 = WebUI.getText(findTestObject('Object Repository/Page_Cora Command Center/span_Available'))

WebUI.comment('Status name :' + Status3)

WebUI.closeBrowser()

