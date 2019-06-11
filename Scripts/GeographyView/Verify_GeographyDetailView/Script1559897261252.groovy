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

String requiredCard = "Geography View"

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()
if(activeCard != requiredCard){
	CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
}

ActualUrl = WebUI.getUrl()

ExpectedUrl = 'http://cncdevui.azurewebsites.net/UI/#/root/dashboard/view/hotspots/fullview'

if (ActualUrl.equals(ExpectedUrl)) {
	WebUI.comment('Geography view detail screen  is displayed')
} else {
	WebUI.comment('Geography view detail screen is not displayed')
}

WebUI.verifyElementText(findTestObject('Object Repository/GeographyView/GeographyWidget'), 'Geography View')

WebUI.verifyElementText(findTestObject('Object Repository/GeographyView/GeographyDetail_ProcessGroups'), 'Process Groups')

WebUI.verifyElementText(findTestObject('Object Repository/GeographyView/GeographyDetail_AutomatedProcess'), 'Automated Processes')

WebUI.closeBrowser()

