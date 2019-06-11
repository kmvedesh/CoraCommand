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

String requiredCard = 'Process Tower View'

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/ProcessTowerView/Processtowerview_header'), 2)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/ProcessTowerView/Processtowerview_header'), GlobalVariable.Min_Delay)

headername = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/Processtowerview_header'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/ProcessTowerView/Hexagonred_count'), GlobalVariable.Min_Delay)

hexagonredcount = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/Hexagonred_count'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ProcessTowerView/Hexagonblue_count'), GlobalVariable.Min_Delay)

hexagonbluecount = WebUI.getText(findTestObject('Object Repository/ProcessTowerView/Hexagonblue_count'))

String processtowername = new String()

processtowerheadername = ((('Hexagon red Count: ' + hexagonredcount) + ('Hexagon blue Count: ' + hexagonbluecount)))

System.out.println(headername)

System.out.println(processtowerheadername)

WebUI.closeBrowser()

