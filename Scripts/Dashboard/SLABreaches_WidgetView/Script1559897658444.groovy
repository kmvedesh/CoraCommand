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

WebUI.verifyElementPresent(findTestObject('Object Repository/Todays_Summary_Panel/Todays_Summery_Text'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Todays_Summary_Panel/Todays_Summery_Text'), 'Today’s Summary')

Todays_Summery = WebUI.getText(findTestObject('Object Repository/Todays_Summary_Panel/Todays_Summery_Text'))

System.out.println('Summery Text is: ' + Todays_Summery)

WebUI.verifyElementPresent(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Breaches'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Breaches'), 'SLA Breaches')

SLA_Breaches_Text = WebUI.getText(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Breaches'))

System.out.println('SLA Breaches Widget Text is: ' + SLA_Breaches_Text)

WebUI.verifyElementPresent(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Count'), 5)

SLA_Breaches_Count = WebUI.getText(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Count'))

System.out.println('SLA Breaches Count is: ' + SLA_Breaches_Count)

WebUI.closeBrowser()

