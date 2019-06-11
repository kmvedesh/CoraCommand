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

//WebUI.click(findTestObject('Object Repository/Page_Home/accountSelection'))
//WebUI.click(findTestObject('Object Repository/Page_Home/walmartLabAccount'))
WebUI.click(findTestObject('Object Repository/Page_Home/insightsTab'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Home/Insights/processMetrics'))

groupName = WebUI.getText(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/RTRGroup'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/RTRGroup'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/cashflowProcess'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/cashflowProcess'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/overAllExecutedCases_ProcessLevel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/averageExecutionTime_ProcessLevel'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/averageHandlingTime_ProcessLevel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/averageHandlingTime_ProcessLevel'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/exceptions_ProcessLevel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/Insights/ProcessMatrices/ProcessGroups/ProcessLevel/exceptions_ProcessLevel'), 
    0)

WebUI.closeBrowser()
