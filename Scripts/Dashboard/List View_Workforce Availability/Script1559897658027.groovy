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

WebUI.waitForElementVisible(findTestObject('Object Repository/Dashboard/List_View'), 15)

WebUI.click(findTestObject('Object Repository/Dashboard/List_View'))

ListViewPage_Url = WebUI.getUrl()

WebUI.comment('Current Page Url is : ' + ListViewPage_Url)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Total_Robot_count_List_View'))

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_RobotID'), 'Robot ID')

Column1 = WebUI.getText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_RobotID'))

WebUI.comment('Column1 name is :' + Column1)

Column2 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_RobotName'), 
    'Robot Name')

WebUI.comment('Column2 name is :' + Column2)

Column3 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_LastRunProcess'), 
    'Last Run Process')

WebUI.comment('Column3 name is :' + Column3)

Column4 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_LastUpdated'), 
    'Last Updated')

WebUI.comment('Column4 name is :' + Column4)

Column5 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_Uptime'), 'Uptime (hh:mm:ss)')

WebUI.comment('Column5 name is :' + Column5)

Column6 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_Utilization'), 
    'Utilization (%)')

WebUI.comment('Column6 name is :' + Column6)

Column7 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_MTBF'), 'MTBF (hh:mm:ss)')

WebUI.comment('Column7 name is :' + Column7)

Column8 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_MTTR'), 'MTTR (hh:mm:ss)')

WebUI.comment('Column8 name is :' + Column8)

Column9 = WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/WorkforceAvailability_ListView_Metrics'), 
    'METRICS (LAST 7 DAYS)')

WebUI.comment('Column9 name is :' + Column9)

WebUI.closeBrowser()

