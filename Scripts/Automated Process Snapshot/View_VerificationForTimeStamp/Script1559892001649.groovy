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

Widget_TimeStamp = WebUI.getText(findTestObject('Object Repository/Automated Process Snapshot/TimeStamp_Widget'))

System.out.println(Widget_TimeStamp)

WebUI.click(findTestObject('Object Repository/Automated Process Snapshot/AutomatedProcessSnapshot_Failed'))

WebUI.delay(5)

View_TimeStamp = WebUI.getText(findTestObject('Object Repository/Automated Process Snapshot/View_AutomatedProcessSnapshot/View_TimeStamp'))

System.out.println(View_TimeStamp)

if (Widget_TimeStamp.equals(View_TimeStamp)) {
    System.out.println('Time Stamp matches')
} else {
    System.out.println('Time Stamp Does not match')
}

WebUI.click(findTestObject('Object Repository/Automated Process Snapshot/View_AutomatedProcessSnapshot/View_LeftClick'))

System.out.println('Left Click done')

WebUI.click(findTestObject('Object Repository/Automated Process Snapshot/View_AutomatedProcessSnapshot/View_RightClick'))

System.out.println('Right Click done')

WebUI.click(findTestObject('Object Repository/Automated Process Snapshot/View_AutomatedProcessSnapshot/View_RightClick'))

System.out.println('Control is in the Last window')

WebUI.comment('Test Case Completed')

WebUI.closeBrowser()

