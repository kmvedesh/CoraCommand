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

WebUI.maximizeWindow()

not_run: WebUI.callTestCase(findTestCase('Common_TestCases/Select Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Common_Objects/Exception_Analysis_Widget'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common_Objects/Exception_Analysis_Widget'), 20)

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_ExceptionWidgetHeader'), 'Exception Analysis')

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_ExceptionCount'), 10)

WidgetView_ExceptionCount = WebUI.getText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_ExceptionCount'), 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(WidgetView_ExceptionCount)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top3ExceptionCount'), 30)

WidgetView_Top3ExceptionCount = WebUI.getText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top3ExceptionCount'), 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(WidgetView_Top3ExceptionCount)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top1stException'), 10)

WidgetView_Top1stException = WebUI.getText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top1stException'), 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(WidgetView_Top1stException)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top2ndException'), 10)

WidgetView_Top2ndException = WebUI.getText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top2ndException'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top3rdException'), 10)

System.out.println(WidgetView_Top2ndException)

WidgetView_Top3rdException = WebUI.getText(findTestObject('Object Repository/Dashboard/ExceptionAnalysisWidget_Top3rdException'), 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(WidgetView_Top3rdException)

WebUI.closeBrowser()

