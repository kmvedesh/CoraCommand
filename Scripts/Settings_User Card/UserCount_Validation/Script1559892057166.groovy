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

WebUI.callTestCase(findTestCase('Settings_User Card/Users Count'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Settings/Cards_Settings/User_Card'))

WebUI.delay(3)

Count_ViewPage = WebUI.getText(findTestObject('Object Repository/Page_Settings/Users_card/View_UserPage/UserCount_UserViewPage'))

System.out.println(Count_ViewPage)

Count1 = findTestObject('Object Repository/Page_Settings/Users_card/Count_Users')

if (Count_ViewPage.equals(Count1)) {
    System.out.println('The count is matching')
} else {
    System.out.println('The count is not matching')
}

WebUI.closeBrowser()

